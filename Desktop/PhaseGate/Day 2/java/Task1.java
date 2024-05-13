import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

	int count = 0;
	
	int counts = 0;


	int collect = 0;
	int number = 0;

	int[] array = new int[10];

	for (count = 0; count < 10; count++) {  
	System.out.println("Collect scores");
	number = scanner.nextInt();
	array[count] = number;
	
	
	

}

	System.out.println(Arrays.toString(array));
	


}
}	
	













