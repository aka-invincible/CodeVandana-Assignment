/*
let numbers = [5, 2, 9, 1, 5, 6];

numbers.sort(function(a, b) {
    return b - a;
});

console.log(numbers);
*/

let numbers = [5, 2, 9, 1, 5, 6];

// Bubble sort to sort the array in descending order
for (let i = 0; i < numbers.length - 1; i++) {
    for (let j = 0; j < numbers.length - 1 - i; j++) {
        if (numbers[j] < numbers[j + 1]) {
            let temp = numbers[j];
            numbers[j] = numbers[j + 1];
            numbers[j + 1] = temp;
        }
    }
}
console.log(numbers);