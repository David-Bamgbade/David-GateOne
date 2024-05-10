cosnst prompt = require('prompt-sync')();

let correct = 0;
let correct =0;

let number1 = 0;
let number2 = 0;

let result = 0;

for (let count = 0; count < 10; count++) {
	number1 = Math.random(10);
	number2 = Math.random(10);

	result = number1 * number2;

	console.log(`{number1} * {number2} = {result}`);

let userInput = prompt("Enter an integer value: ");
let user = parseInt(userInput, 10);

if (user == result) {
correct++
console.log("correct");
}

else  {
	incorrect++
	Console.log("incorrect");
	}

console.log(`The number of correct answers are {correct}`);
console.log(`The number of incorrect answers are {incorrect}`);