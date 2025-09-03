// TODO: use reduce to find the total sum (15)
const nums = [1, 2, 3, 4, 5];
const sum = nums.reduce((acc, curr) => acc + curr, 0)
console.log(sum)

// TODO: use reduce to find the product (24)
const nums1 = [2, 3, 4];
const find24 = nums1.reduce((acc, curr) => acc * curr, 1) // explain this one to me
console.log(find24)

// TODO: use reduce to find the longest word ("fantastic")
const words = ["hi", "fantastic", "sun", "umbrella"];
const longest = words.reduce((a, b) => a.length > b.length ? a : b) // explain this to me, what happened to the 0?
console.log(longest)

// TODO: use reduce to return an object like { yes: 3, no: 2 }
const votes = ["yes", "no", "yes", "yes", "no"];
const countVotes = votes.reduce((acc, vote) => {
    acc[vote] = (acc[vote] || 0) + 1
    return acc
}, {})
console.log(countVotes)

// TODO: use reduce to return an object like:
// { b: 1, a: 3, n: 2 }
const word = "banana".split("") // ["b","a","n","a","n","a"]
const countLetters = word.reduce((counts, letter) => {
    counts[letter] = (counts[letter] || 0) + 1
    return counts
}, {})
console.log(countLetters)


// TODO: use reduce to return an object showing how many times each word appears
const sentence = "the cat sat on the mat with the cat";
// Step 1: turn this into an array of words
// ["the", "cat", "sat", "on", "the", "mat", "with", "the", "cat"]
const wordsInArr = sentence.split(" ");
// Expected result:
// { the: 3, cat: 2, sat: 1, on: 1, mat: 1, with: 1 }

const countWords = wordsInArr.reduce((count, word) => {
    count[word] = (count[word] || 0) + 1
    return count
}, {})

console.log(countWords)

// TODO: use reduce to return a new array of only the even numbers, squared
const num2 = [1, 2, 3, 4, 5, 6];
// Expected result: [4, 16, 36]
const doubleEven = num2.reduce((arr, val) => {
   if (val % 2 == 0) {
    arr.push(val * val)
   }
   return arr
} ,[])

console.log(doubleEven)