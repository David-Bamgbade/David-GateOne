import java.util.Scanner;

public class TaskSix {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);

	int evenNumber = 0;
	int sum = 0;
	int sumOfNumbers = 10;

	for (int i = 0; i < 10; i++) {
	System.out.println("Enter number");
	int number = scanner.nextInt();
	if (number % 2 == 0){
	evenNumber = number;
	sum += evenNumber;
	}
    }

	int averageOfSumOfEvenNumbers = sum / sumOfNumbers;

	System.out.println("Average Of Sum Of Even Numbers is " + averageOfSumOfEvenNumbers);



     }	
}


