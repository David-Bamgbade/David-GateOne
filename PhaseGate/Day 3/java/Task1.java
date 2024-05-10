import java.util.*;

public class Task1 {
public static void main(String[] args) {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	int correct = 0;
	int incorrect = 0;

	int number1 = 0;
	int number2 = 0;
	int result = 0;

	int answer = 0;

	for(int count = 0; count < 10; count++) {
	number1 = random.nextInt(10);
	number2 = random.nextInt(10);

	result = number1 * number2;

	System.out.print(number1 + "\t" + "*" + "\t" + number2 + "\t" +  "=" + "\t");
	answer = scanner.nextInt();
	

	if(answer == result) {
	System.out.println("Correct");
	correct++;
	}
 
	else {
	System.out.println("Incorrect");
	incorrect++;
	}

}
	System.out.println("Number of correct answers are " + correct);
	System.out.println("Number of incorrect answers are " + incorrect);













}
}