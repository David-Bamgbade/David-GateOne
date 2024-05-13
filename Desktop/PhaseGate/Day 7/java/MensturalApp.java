import java.util.*;
import java.time.*;

public class MensturalApp {
public static void main(String[] args) {


	Scanner scanner = new Scanner(System.in);

	System.out.println("Date Your Last Period Started is DD-MM-YYYY");
	String day = scanner.nextLine();

	LocalDate date = LocalDate.parse(day);

	System.out.println("How Long Does Your Period Last");
	int periodLast = scanner.nextInt();

	System.out.println("How Long Is your Menstural Cycle");
	int cycle = scanner.nextInt();

	Date period = new Date();



	

	



}
}