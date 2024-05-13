import java.util.Scanner;

public class TaskFour {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int sumOfEvenIndex = 0;

for (int i = 0; i < 10; i = i++) {
System.out.println("Enter number");
int number = scanner.nextInt();
i++;
sumOfEvenIndex += number;
}


System.out.println("sumOfEvenIndex is " + sumOfEvenIndex);

}
}