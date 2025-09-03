// TODO: return a new array with each number doubled
const nums = [1, 2, 3, 4, 5];
const doubled = nums.map((num) => num * 2)
console.log(doubled)

// TODO: return each word in uppercase
const words = ["hello", "world", "javascript"]
const uppercased = words.map((word) => word.toUpperCase())
console.log(uppercased)

// TODO: return an array of name lengths
const names = ["Alice", "Bob", "Christina", "Dan"];
const nameLengths = names.map((name) => name.length)
console.log(nameLengths)

// TODO: return ["Item 10", "Item 20", "Item 30"]
const nums1 = [10, 20, 30];
const prefixNums = nums1.map((num) => "Item " + num)
console.log(prefixNums)

// TODO: return ["d", "c", "e", "t"]
const animals = ["dog", "cat", "elephant", "tiger"];
const lettersOnly = animals.map((animal) => animal[0])
console.log(lettersOnly)