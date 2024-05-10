public class TaskThree {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

int sum = 0;
int average =0;
int numberOfSum = 10;

for (int i = 0; i < 10; i++) {
System.out.println("Enter number");
int number = scanner.nextInt();
sum += number;
}

average = sum / 10;

System.out.println("Average is " + average);
System.out.println("Sum is " + sum);

}
}