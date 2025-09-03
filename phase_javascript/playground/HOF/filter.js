// TODO: use filter to keep only even numbers
const nums = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
const even = nums.filter((num) => num % 2 == 0)
console.log(even)

// TODO: filter to get only words with length > 5
const words = ["hi", "fantastic", "sun", "umbrella", "code", "awesome"]
const lengthOf5 = words.filter((word) => word.length > 5)
console.log(lengthOf5)

// TODO: filter ages to 18 and over
const ages = [12, 17, 18, 24, 30, 15];
const over18 = ages.filter((age) => age >= 18)
console.log(over18)

// TODO: filter only the negative numbers
const numbers = [-5, 0, 12, -3, 8, -7];
const isNegative = numbers.filter((number) => number < 0)
console.log(isNegative)

// TODO: filter names that start with "A"
const names = ["Alice", "Bob", "Amanda", "Zoe", "Arjun", "Liam"]
const namesStartWithA = names.filter((name) => name.startsWith('A'))
console.log(namesStartWithA)