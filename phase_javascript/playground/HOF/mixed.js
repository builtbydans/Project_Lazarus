// TODO: use filter + map to return an array of names for people aged 18+
// Expected: ["Bob", "Diana"]
const people = [
  { name: "Alice", age: 17 },
  { name: "Bob", age: 22 },
  { name: "Charlie", age: 16 },
  { name: "Diana", age: 30 }
];

const over18 = people.filter((person) => person.age >= 18).map((person) => person.name)
console.log(over18)

// TODO: use filter + map to return squares of only the positive numbers
// Expected: [4, 16, 36]
const numbers = [-3, -1, 0, 2, 4, 6];
const positiveSquared = numbers.filter((number) => number > 0 && number % 2 == 0).map((num) => num * num)
console.log(positiveSquared)

// TODO:
// 1. Filter to only books priced under 10
// 2. Map those books to just their titles
// 3. Transform each title to UPPERCASE
// Expected: ["BOOK B", "BOOK C"]

const books = [
  { title: "Book A", price: 12 },
  { title: "Book B", price: 5 },
  { title: "Book C", price: 8 },
  { title: "Book D", price: 20 }
];

const under10 = books.filter((book) => book.price < 10).map((book) => book.title.toUpperCase())
console.log(under10)

// TODO:
// 1. Use .map() to calculate the total price for each line (price × qty).
//    e.g. Book → 25.98, Pen → 7.50, etc.
// 2. Then use .reduce() to sum all those totals together.
// Expected: the final cart total (as a single number).
const cart = [
  { item: "Book", price: 12.99, qty: 2 },
  { item: "Pen", price: 1.50, qty: 5 },
  { item: "Headphones", price: 29.99, qty: 1 },
  { item: "Mug", price: 6.00, qty: 3 }
];

const cartTotal = cart
    .map((item) => item.price * item.qty)
    .reduce((sum, price) => sum + price, 0)

// TODO:
// 1. First, filter the cart to keep only items with qty > 1
//    (so ignore Headphones).
// 2. Then map each remaining item to price × qty.
// 3. Then reduce to get the total.
// Expected result: 25.98 (Books) + 7.50 (Pens) + 18.00 (Mugs) = 51.48

const moreThanOneCartTotal = cart
    .filter((product) => product.qty > 1)
    .map((item) => item.price * item.qty)
    .reduce((sum, price) => sum + price, 0)

console.log(cartTotal)
console.log(moreThanOneCartTotal.toFixed(2))