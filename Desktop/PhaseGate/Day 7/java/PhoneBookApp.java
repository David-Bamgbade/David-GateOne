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

7-> Back

""";

System.out.println(prompt);

System.out.println("Enter Next Option");
int userInput1 = scanner.nextInt();

System.out.println();

switch(userInput1) {

	case 1: System.out.println("1-> Add contact");
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

	System.out.println();

	System.out.println("Enter Next Option");
	int userInput2 = scanner.nextInt();

	System.out.println();

	switch(userInput2) {
	
	case 1: System.out.println("1-> Enter Phone Number");
		break;

	case 2: System.out.println("2-> Back");
		break;
	}

	System.out.println();

	


}
}
