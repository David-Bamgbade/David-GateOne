import java.util.*;

public class PhoneBookApp {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

String prompt = """

WELCOME TO PHONE BOOK

1-> Add contact

2-> Remove contact;

3-> Find contact by phone number

4-> find contact by first name

5-> Find contact by last name

6-> Edit contact

""";

System.out.println(prompt);

System.out.println("Enter Option");
int userInput1 = scanner.nextInt();

switch(userInput1) {

	case 1: System.out.println("Add contact");
		break;

	case 2: System.out.println("Remove contact");
		break;

	case 3: System.out.println("Find contact by phone number");
		break;

	case 4: System.out.println("Find contact by first name");
		break;

	case 5: System.out.println("Find contact by last name");
		break;

	case 6: System.out.println("Edit contact");
		break;

	}

    }
} 
