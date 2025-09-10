// ------------------------------
// DOM Identifiers
// ------------------------------
const els = {
  menuList: document.getElementById('menu-list'),
  orderSection: document.getElementById('order-section'),
  orderLines: document.getElementById('order-lines'),
  orderDiscountRow: document.getElementById('order-discount'),
  discountAmount: document.getElementById('discount-amount'),
  totalAmount: document.getElementById('total-amount'),
  btnComplete: document.getElementById('btn-complete'),
  confirmation: document.getElementById('confirmation'),
  orderHeading: document.getElementById('order-heading'),

  // Dialog + form fields
  dlg: document.getElementById('payment-dialog'),
  form: document.getElementById('payment-form'),
  inputName: document.getElementById('name'),
  inputCard: document.getElementById('card'),
  inputCvv: document.getElementById('cvv'),
  errName: document.getElementById('err-name'),
  errCard: document.getElementById('err-card'),
  errCvv: document.getElementById('err-cvv'),
  btnCancel: document.getElementById('btn-cancel'),
  btnPay: document.getElementById('btn-pay'),
};

// ------------------------------
// Data
// ------------------------------
const MENU = [
  {
    id: 'pizza',
    name: 'Pizza',
    desc: 'pepperoni, mushroom, mozzarella',
    price: 14,
    emoji: '🍕',
  },
  {
    id: 'burger',
    name: 'Hamburger',
    desc: 'beef, cheese, lettuce',
    price: 12,
    emoji: '🍔',
  },
  {
    id: 'beer',
    name: 'Beer',
    desc: 'grain, hops, yeast, water',
    price: 6,
    emoji: '🍺',
  },
  {
    id: 'fries',
    name: 'Fries',
    desc: 'salted shoestring',
    price: 5,
    emoji: '🍟',
  },
];

// -----------------------
// Cart
// -----------------------

const allItems = ['pizza', 'burger', 'beer', 'fries'];
const cart = {};
let isPaid = false;

const addToCart = (item) => {
  if (cart[item]) {
    cart[item]++;
  } else {
    cart[item] = 1;
  }
};

const removeFromCart = (item) => {
  if (cart[item] > 1) {
    cart[item]--;
  } else if (cart[item] === 1) {
    delete cart[item];
  }
  renderOrder();
};

const add = document.addEventListener('click', (e) => {
  if (isPaid) return;
  const btn = e.target.closest('[data-add]');
  if (!btn) return;
  addToCart(btn.dataset.add);
  els.orderSection.classList.remove('hidden');
  renderOrder();
});

const remove = document.addEventListener('click', (e) => {
  if (isPaid) return;
  const removeBtn = e.target.closest('[data-remove]');
  if (!removeBtn) return;
  removeFromCart(removeBtn.dataset.remove);
  renderOrder();
});

const renderMenu = () => {
  const html = MENU.map(({ emoji, name, price, id }) => {
    return `
      <li class="menu__item">
        <span class="emoji">${emoji}</span>
        <span class="name">${name}</span>
        <span class="price">$${price}</span>
        <button data-add="${id}">Add</button>
      </li>
    `;
  }).join('');

  els.menuList.innerHTML = html;
};

const renderOrder = (summaryMode = false) => {
  let sum = 0;
  const html = Object.entries(cart)
    .map(([id, qty]) => {
      const { name, price } = MENU.find((item) => item.id === id);
      sum += price * qty;
      return `<div class="order__list">
                ${name} × ${qty} — $${price * qty}
                ${summaryMode ? '' : `<button data-remove="${id}">Remove</button>`}
              </div>`;
    })
    .join('');

  if (Object.keys(cart).length === 0) {
    els.orderSection.classList.add('hidden');
    els.orderDiscountRow.classList.add('hidden');
  }

  els.orderLines.innerHTML = html;

  const qualifiesForDiscount = allItems.every((id) => cart[id] > 0);

  if (qualifiesForDiscount) {
    const discountedSum = sum * 0.75;
    els.orderDiscountRow.classList.remove('hidden');
    els.discountAmount.innerText = `$${sum - discountedSum}`;
    els.totalAmount.innerHTML = `<s>$${sum}</s> $${discountedSum} (25% off)`;
  } else {
    els.totalAmount.innerText = '$' + sum;
  }
};

const clearErrors = () => {
  els.errName.textContent = '';
  els.errCard.textContent = '';
  els.errCvv.textContent = '';
};

const onlyDigits = (str) => {
  return str.replace(/\D/g, '');
};

const validateForm = () => {
  clearErrors();
  let ok = true;

  if (!els.inputName.value.trim()) {
    els.errName.textContent = 'Please enter the name on the card.';
    ok = false;
  }

  const digits = onlyDigits(els.inputCard.value);
  if (digits.length !== 16) {
    els.errCard.textContent = 'Card number must be 16 digits.';
    ok = false;
  }

  const cvv = onlyDigits(els.inputCvv.value);
  if (!(cvv.length === 3 || cvv.length === 4)) {
    els.errCvv.textContent = 'CVV must be 3 or 4 digits.';
    ok = false;
  }

  return ok;
};

const orderSummary = () => {
  els.btnComplete.classList.add('hidden');
  els.orderHeading.innerText = 'Your order summary';
  renderOrder(true);
};

const setupCheckout = () => {
  els.btnComplete.addEventListener('click', () => els.dlg.showModal());
  els.btnCancel.addEventListener('click', () => els.dlg.close());

  els.form.addEventListener('submit', (e) => {
    e.preventDefault();
    if (!validateForm()) return;

    isPaid = true;
    document
      .querySelectorAll('[data-add]')
      .forEach((btn) => (btn.disabled = true));

    orderSummary();
    els.dlg.close();
    els.confirmation.classList.remove('hidden');
    els.confirmation.textContent = `Thanks, ${els.inputName.value.trim()}! Your order is on its way.`;
  });

  els.inputCard.addEventListener('input', () => {
    const digits = onlyDigits(els.inputCard.value).slice(0, 16);
    els.inputCard.value = digits.replace(/(\d{4})(?=\d)/g, '$1 ').trim();
  });
};

// program start functions
renderMenu();
setupCheckout();
