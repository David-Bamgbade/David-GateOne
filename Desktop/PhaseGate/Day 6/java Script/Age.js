const prompt = require("prompt-sync")();

	let userInput = " ";

	do {
	
	let dob = prompt("Enter Date of Birth in DD-MM-YYY");
	userInput = dob.replace("-", "");
	}
	while(userInput.length() !=8);
	
	}

	let strDay = userInput.substring(0,2);
	let intDay = parseInt(strDay);
	let strMonth = userInput.substring(2,4);
	let intMonth = parseInt(strMonth);
	let strYear = userInput.substring(4,8);
	let intYear = parseInt(strYear);
	const date = newDate();
	let year = today.getYear();
	let month = today.getMonth();
	

	
	
		
	

	
	
	

