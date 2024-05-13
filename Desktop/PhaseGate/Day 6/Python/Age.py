import datetime
def ages():
	dob = ""
	while len(dob)!= 8:
		person = input(" Enter date of birth in MM-DD-YYYY")
		dob = person.replace("-", "")
				
		dob = person[:2]
		day = int(dob)
		month = person[2:4]
		months = int(month)
		years = person[4:8]
		year = int(years)
		today = datetime.date()
		currentYear = today.year
		currentMonth = today.month
		currentDay = today.day
		age = " "
		if currentDay < day or currentMonth < months:
			age = currentYear - year - 1
		else:
			age = currentYear - year
		print(age)

ages()
		 

