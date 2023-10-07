/**
 * This code can be used in local running environment just hardcode inputSentence
 * to desired string.
 */

let inputSentence = "This is a sunny day";
let wordArray = inputSentence.split(/\s+/);
let reversedWords = wordArray.map(word => word.split('').reverse().join(''));

let reversedSentence = reversedWords.join(" ");
console.log(reversedSentence);