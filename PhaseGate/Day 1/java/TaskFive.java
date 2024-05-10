import java.util.Scanner;

public class TaskFive {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int evenNumber = 0;
	int sum = 0;

	for (int i = 0; i < 10; i++) {
	System.out.println("Enter number");
	int number = scanner.nextInt();
	if (number % 2 == 0){
	evenNumber = number;
	sum += evenNumber;
	}

	
    }

	System.out.println("Sum of even number is " + sum);
		





}
}