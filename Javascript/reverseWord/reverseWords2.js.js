/**
 * This code can be used in local running environment just hardcode inputSentence
 * to desired string.
 */

/*
let inputSentence = "This is a sunny day";
let wordArray = inputSentence.split(/\s+/);
let reversedWords = wordArray.map(word => word.split('').reverse().join(''));

let reversedSentence = reversedWords.join(" ");
console.log(reversedSentence);
*/

let inputSentence = "Hello World";
let wordArray = inputSentence.split(/\s+/);
let reversedWords = [];

for (let i = 0; i < wordArray.length; i++) {
    let word = wordArray[i];
    let reversedWord = "";
    for (let j = word.length - 1; j >= 0; j--) {
        reversedWord += word[j];
    }
    reversedWords.push(reversedWord);
}

let reversedSentence = reversedWords.join(" ");
console.log(reversedSentence);