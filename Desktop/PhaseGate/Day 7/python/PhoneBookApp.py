First_Name = []
Last_Name = []
Phone_Number = []

def menu():

	Main_Menu = '''
	WELCOME TO PHONE BOOK

	1-> Add contact

	2-> Remove contact

	3-> Find contact by phone number

	4-> find contact by first name

	5-> Find contact by last name

	6-> Edit contact

	7-> Back
	'''
	print(Main_Menu)

	userInput1 = input("Enter Option ")

	print()

	if userInput1 == 1:
		addContact()

	if userInput1 == 2:
		delete()
		

menu()   

def addContact():

	contact = input("Enter First Name ")
	
	First_Name.append(contact)

	Second_Name = input("Enter second Name ")

	Last_Name.append(Second_Name)	

	number = input("Enter Phone Number ")
	
	Phone_Number.append(number)
	
addContact()
print()

def addAnotherContact():

	ask = input("Do you want to add another contact ")

	if ask == ("yes"):
		addContact()
	print("<<<<<<<<<<Contact Added Sucessfully>>>>>>>>>>")
	
	
	menu()
addAnotherContact()	


def delete():

	remove_firstname = input("Enter First Name to be removed ") 

	First_Name.append(remove_firstname)

	First_Name.remove(remove_firstname)

	remove_lastname = input("Enter Last Name to be removed ") 

	Last_Name.append(remove_lastname)
	
	Last_Name.remove(remove_lastname)

	remove_number = input("Enter Phone Number to be removed ") 

	Phone_Number.append(remove_number)

	Phone_Number.remove(remove_number)

	print("<<<<<<<<<<Contact Sucessfully Deleted>>>>>>>>>>")
	
	menu()

delete()

	

	



