const prompt = require('prompt-sync')();

	score = [];

	for(let count = 0; count < 10; count++) {
	let user = prompt("enter score");
	score = user;
	}

	console.log(score);