const prompt = require("prompt-sync")();

let dateInput = prompt("Enter Date in YYYY-MM-DD ");

let mensturationDate = new Date(dateInput);

let periodLast = parseInt(prompt("How Long Does Your Period Last "));
	
let cycle = parseInt(prompt("How Long Is your Menstural Cycle "));	

let nextPeriod = mensturationDate.addDays(cycle);

Console.log(nextPeriod)






