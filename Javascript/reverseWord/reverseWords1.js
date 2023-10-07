/**
  *  Since JS is a language of browser it is not possible to take input from user
     without interacting with browsers.
  *  We can run the following script in browser console to give input using prompt.
  *  NOTE: This will give error in local running environment (IDE) as NodeJs
     doesn't have prompt implemented in it.
*/
let inputSentence = prompt("Enter the input sentence");
let wordArray = inputSentence.split(/\s+/);
let reversedWords = wordArray.map(word => word.split('').reverse().join(''));

let reversedSentence = reversedWords.join(" ");
console.log(reversedSentence);