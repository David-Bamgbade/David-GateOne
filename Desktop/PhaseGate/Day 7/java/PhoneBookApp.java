import java.util.*;

public class PhoneBookApp {

static ArrayList<String> FirstName = new ArrayList<String>();	
static ArrayList<String> LastName = new ArrayList<String>();
static ArrayList<String> PhoneNumber = new ArrayList<String>();

public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);




	String prompt = """

	WELCOME TO PHONE BOOK

	1-> Add contact

	2-> Remove contact

	3-> Find contact by phone number

	4-> find contact by first name

	5-> Find contact by last name

	6-> Edit contact

	7-> Back

	""";

	System.out.println(prompt);

	System.out.println("Enter Next Option");
	int userInput1 = scanner.nextInt();

	System.out.println();

	switch(userInput1) {

	case 1: addContact();
		break;

	case 2: removeContact();
		break;

	case 3: findContactByPhoneNumber();
		break;

	case 4: 

	case 5:

	case 6:  mainMenu(); 

	}

	

	
	}
	public static void addContact(){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter First Name");
	String firstName = scanner.nextLine();
	
	FirstName.add(firstName);

	System.out.println("Enter second Name");
	String secondName = scanner.nextLine();

	LastName.add(secondName);	

	System.out.println("Enter Phone Number");
	String number = scanner.nextLine();
	
	PhoneNumber.add(number);
 	addAnotherContact();	
	}
	
	public static void addAnotherContact(){
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Do you want to add another contact");
	String contact = scanner.nextLine();

	if(contact.equalsIgnoreCase("yes")) {
		addContact();
	}		
		else {
	System.out.println("<<<<<<<<<<Contact Added Sucessfully>>>>>>>>>>");
	 mainMenu();
	}
	}
	
	public static void mainMenu(){

	String prompt = """

	WELCOME TO PHONE BOOK

	1-> Add contact

	2-> Remove contact

	3-> Find contact by phone number

	4-> find contact by first name

	5-> Find contact by last name

	6-> Edit contact

	7-> Back

	""";

	System.out.println(prompt);
	
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter Next Option");
	int userInput1 = scanner.nextInt();

	System.out.println();

	switch(userInput1) {

	case 1: addContact();
		break;

	case 2: removeContact();
		break;

	case 3: findContactByPhoneNumber();
		break;

	case 4: findNumberByFirstName();
		break;

	case 5:

	case 6:  mainMenu();
		 break;
	}
      }



	public static void removeContact(){

	Scanner scanner = new Scanner(System.in);

  	String firstname = "";
	String secondname = "";
	String phoneNumber = "";

 	System.out.println("Remove firstname of a contact");
     	String name = scanner.next();

  	for(int count = 0; count < FirstName.size(); count++)  {
  	firstname = FirstName.get(count);

    	if(firstname.equals(name)) {
      	FirstName.remove(firstname);
     	System.out.println(FirstName);
	}
	}

	System.out.println("Remove second name of contact");
     	String name1 = scanner.next();

	for(int counter = 0; counter < FirstName.size(); counter++)  {
  	secondname = LastName.get(counter);

	if(secondname.equals(name)) {
      	FirstName.remove(secondname);
     	System.out.println(LastName);
	}
	}

	System.out.println("Remove phone number of a contact");
     	String name2 = scanner.next();

	for(int counts = 0; counts < FirstName.size(); counts++)  {
  	phoneNumber = LastName.get(counts);

	if(PhoneNumber.equals(name2)) {
      	PhoneNumber.remove(phoneNumber);
     	System.out.println(PhoneNumber);
	}
	}
	System.out.println(">>>>>>>>>>Deleted Successfully<<<<<<<<<<");
	mainMenu();	
      }
	
	public static void findContactByPhoneNumber(){
	Scanner scanner = new Scanner(System.in);

	String numberToFind = "";
	
	System.out.println("Enter Phone Number To Find Contact");
	String contactToFind = scanner.nextLine();

	for(int count = 0; count < PhoneNumber.size(); count++)  {
  	numberToFind = PhoneNumber.get(count);

	if(contactToFind.equals(numberToFind)){
	PhoneNumber.indexOf(numberToFind);	
	System.out.println("This is the contact" + numberToFind);
	}
	else {
		System.out.println("Number Does Not Exist");
	}		
	}
   		 mainMenu();
	}
	
	public static void findNumberByFirstName(){

	Scanner scanner = new Scanner(System.in);

	String numberByFirstName = "";
	
	System.out.println("Enter Phone Number To Find Contact");
	String firstNameNumber = scanner.nextLine();

	for(int count = 0; count < FirstName.size(); count++)  {
  	numberByFirstName = FirstName.get(count);

	if(firstNameNumber.equals(numberByFirstName)){
	FirstName.indexOf(numberByFirstName);	
	System.out.println("This is the contact" + firstNameNumber);
	}
	else {
		System.out.println("Number Does Not Exist");
	}		
	}
   		 mainMenu();
	}
			















}

 	






  

