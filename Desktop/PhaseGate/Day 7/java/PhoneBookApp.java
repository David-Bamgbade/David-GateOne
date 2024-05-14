import java.util.*;

public class PhoneBookApp {
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

""";

System.out.println(prompt);

System.out.println("Enter Next Option");
int userInput1 = scanner.nextInt();

System.out.println();

switch(userInput1) {

	case 1: optionContact();
		break;

	case 2: System.out.println("2-> Remove contact");
		break;

	case 3: System.out.println("3-> Find contact by phone number");
		break;

	case 4: System.out.println("4-> Find contact by first name");
		break;

	case 5: System.out.println("5-> Find contact by last name");
		break;

	case 6: System.out.println("6-> Edit contact");
		break;
	}

	System.out.println();

	System.out.println("Enter Next Option");
	int userInput2 = scanner.nextInt();

	System.out.println();

	switch(userInput2) {

	case 1: addContact();
		break;

	case 2: backToMainMenu();
		break;

	}

	System.out.println();

	System.out.println("No More Option");
	System.out.println();
	System.out.println("1-> Back");
	System.out.println("2-> Back To Main Menu");	

	System.out.println();

	System.out.println("Enter Next Option");
	int userInput4 = scanner.nextInt();

	switch(userInput4) {

	case 1: optionContact();
		break;

	case 2: backToMainMenu();
		break;
	}


	System.out.println();

	System.out.println("Enter Next Option");
	int userInput6 = scanner.nextInt();

	switch(userInput6) {

	case 1: addContact();

	case 2: back2();

	}
	
	
	}
	public static void addContact(){
	Scanner scanner = new Scanner(System.in);

	System.out.println("Enter First Name");
	String firstName = scanner.nextLine();

	System.out.println("Enter Last Name");
	String lastName = scanner.nextLine();

	System.out.println("Enter Phone Number");
	String number = scanner.nextLine();	
	}

	public static void backToMainMenu(){
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
	}

	public static void back(){
	System.out.println("1-> Enter contact Details");

	System.out.println("2-> Back To Main Menu");
	
	}

	public static void back2() {

	System.out.println("1-> Enter contact Details");
	System.out.println("2-> Back");	
	System.out.println("3-> Back To Main Menu");
	}		

	public static void optionContact(){

	System.out.println("1-> Enter contact Details");

	System.out.println("2-> Back To Main Menu");
	}


	

}

 	










