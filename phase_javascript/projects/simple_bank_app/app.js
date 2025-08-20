// --- Cached DOM references ---
const accountBalanceEl = document.getElementById("balance");
const overdraftLimitEl = document.getElementById("overdraft-limit");
const helpTextEl = document.getElementById("help-text");
const accountNameEl = document.getElementById("account-name");
const accountInputEl = document.getElementById("account-input");
const amountInputEl = document.getElementById("amount");
const overdraftInputEl = document.getElementById("overdraft-input");
const txListEl = document.getElementById("tx-list");

// --- Account state ---
let accountState = {
  balance: 0,
  overdraft: 0,
  name: "Main",
  transactions: []
};

// --- Save state ---
function saveAccountState() {
  localStorage.setItem("accountState", JSON.stringify(accountState));
}

// --- Load state ---
function loadAccountState() {
  const saved = localStorage.getItem("accountState");
  if (saved) {
    accountState = JSON.parse(saved)
  }
  updateDisplays();
}

// --- Update displays ---
function updateDisplays() {
  updateNameDisplay();
  updateBalanceDisplay();
  updateOverdraftDisplay();
  updateTransactionsDisplay();
}

// --- Display helpers ---
function updateBalanceDisplay() {
  accountBalanceEl.textContent = formatCurrency(accountState.balance);
}

function updateOverdraftDisplay() {
  overdraftLimitEl.textContent = formatCurrency(accountState.overdraft);
}

function updateNameDisplay() {
  accountNameEl.textContent = accountState.name;
}

function updateTransactionsDisplay() {
  txListEl.innerHTML = "";

  accountState.transactions.forEach((transaction) => {
    const li = document.createElement("li");
    li.classList.add("tx", `tx--${transaction.type.toLowerCase()}`);

    li.textContent = `${transaction.type} ${transaction.type === "Deposit" ? "+" : "-"}${formatCurrency(transaction.amount)} 
    - ${transaction.timestamp} - Balance: ${formatCurrency(transaction.balance)} - Overdraft: ${formatCurrency(transaction.overdraft)}`;

    txListEl.appendChild(li);   
  })
}

function clearInputs() {
  amountInputEl.value = "";
  overdraftInputEl.value = "";
  accountInputEl.value = "";
}

function formatCurrency(value) {
  return `£${value.toFixed(2)}`;
}

// --- Deposit ---
document.getElementById("btn-deposit").addEventListener("click", deposit);

function deposit() {
  const amount = parseFloat(amountInputEl.value);

  if (isNaN(amount) || amount <= 0) {
    helpTextEl.textContent = "Please enter a positive number";
    return;
  }
  if (amount > 10000) {
    helpTextEl.textContent =
      "Error: please visit the bank to deposit large amounts over 10,000";
    return;
  }

  accountState.balance += amount;
  updateBalanceDisplay();
  helpTextEl.textContent = `Successfully deposited: ${formatCurrency(amount)}`;
  addTransaction("Deposit", amount, accountState.balance);

  clearInputs();
}

// --- Withdraw ---
document.getElementById("btn-withdraw").addEventListener("click", withdraw);

function withdraw() {
  const amount = parseFloat(amountInputEl.value);
  const totalFunds = accountState.balance + accountState.overdraft;

  if (isNaN(amount) || amount <= 0) {
    helpTextEl.textContent = "Please enter a positive number";
    return;
  }

  if (amount > totalFunds) {
    helpTextEl.textContent =
      "Error: You do not have enough funds to make a withdrawal";
    return;
  }

  if (amount <= accountState.balance) {
    accountState.balance -= amount;
  } else {
    const overdraftNeeded = amount - accountState.balance;
    accountState.balance = 0;
    accountState.overdraft -= overdraftNeeded;
    updateOverdraftDisplay();
  }

  updateBalanceDisplay();
  helpTextEl.textContent = `Successfully withdrew: ${formatCurrency(amount)}`;
  addTransaction("Withdrawal", amount, accountState.balance);

  clearInputs();
}

// --- Reset ---
document.getElementById("btn-reset").addEventListener("click", reset);

function reset() {
  const ok = window.confirm(
    "This action will clear all balance, overdraft limit and user settings. Proceed?"
  );

  if (!ok) return;

  accountState.balance = 0;
  accountState.overdraft = 0;
  accountState.name = "Main";
  accountState.transactions = [];

  updateDisplays();
  saveAccountState();
  localStorage.clear();

  txListEl.innerHTML = "";
  helpTextEl.textContent = "";
  clearInputs();
}

// --- Apply Settings ---
document.getElementById("btn-apply-settings").addEventListener("click", applySettings);

function applySettings() {
  const overdraftRaw = overdraftInputEl.value.trim();
  const renameVal = accountInputEl.value.trim();

  if (!renameVal && !overdraftRaw) {
    helpTextEl.textContent = "No changes applied to your account";
    return;
  }

  if (overdraftRaw) {
    const overdraftVal = Number(overdraftRaw);
    if (overdraftVal > 5000) {
      helpTextEl.textContent = "Error: overdraft cannot exceed £5000";
      return;
    }
    accountState.overdraft = overdraftVal;
    updateOverdraftDisplay();
    clearInputs();
  }

  if (renameVal) {
    accountState.name = renameVal
    accountNameEl.textContent = accountState.name;
    clearInputs();
  }

  saveAccountState();
}

// --- Transactions ---
function addTransaction(type, amount, balance) {
  const timestamp = new Date().toLocaleString("en-GB", {
    day: "2-digit",
    month: "2-digit",
    year: "numeric",
    hour: "2-digit",
    minute: "2-digit",
    second: "2-digit",
  });

  accountState.transactions.push({
    type,
    amount,
    balance,
    overdraft: accountState.overdraft,
    timestamp
  });
  saveAccountState();
  updateTransactionsDisplay();
}

// --- Load from localStorage ---
loadAccountState();
