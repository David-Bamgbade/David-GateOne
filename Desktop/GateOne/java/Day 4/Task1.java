import java.util.*;

public class Task1 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

	int count = 0;
	int counter = 0;
	
	String[] characterInput = new String[9];
	String input = null;

	char positive = 'x';
	char negative = 'O';

	for(count = 0; count < characterInput.length; count++) {
		System.out.println("Enter X or O ");
		input = scanner.nextLine();
	}

	if(!input.equals("x") | !input.equals("o")) {
	System.out.println("invalid input");
	}

	if (input.equals("x")) {
		characterInput[0] = input;
	}

	if (input.equals("o")) {
		characterInput[1] = input;
	}
	
	if (input.equals("x")) {
		characterInput[2] = input;
	}

	if (input.equals("o")) {
		characterInput[3] = input;
	}
	
	if (input.equals("x")) {
		characterInput[4] = input;
	}

	if (input.equals("o")) {
		characterInput[5] = input;
	}

	if (input.equals("x")) {
		characterInput[6] = input;
	}

	if (input.equals("o")) {
		characterInput[7] = input;
	}
	
	if (input.equals("x")) {
		characterInput[8] = input;
	}

	
	System.out.print(characterInput[0] + "\t");
	System.out.print(characterInput[1] + "\t");
	System.out.print(characterInput[2]);
	System.out.print("\n");
	
	System.out.print(characterInput[3] + "\t");
	System.out.print(characterInput[4] + "\t");
	System.out.print(characterInput[5]);
	System.out.print("\n");

	System.out.print(characterInput[6] + "\t");
	System.out.print(characterInput[7] + "\t");
	System.out.print(characterInput[8]);
	System.out.print("\n");

}
}