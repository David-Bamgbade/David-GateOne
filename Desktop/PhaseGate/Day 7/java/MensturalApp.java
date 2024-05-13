import java.util.*;
import java.time.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MensturalApp {
public static void main(String[] args) {


	Scanner scanner = new Scanner(System.in);

	System.out.println("The Date Your Last Period Started in YYYY-MM-DD");
	String day = scanner.nextLine();

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-mm-DD");

	System.out.println("How Long Does Your Period Last");
	int periodLast = scanner.nextInt();
	
	System.out.println("How Long Is your Menstural Cycle");
	int cycle = scanner.nextInt();

	LocalDate date = LocalDate.parse(day);
	
	LocalDate nextPeriod = date.plusDays(28);

	LocalDate endPeriod = nextPeriod.plusDays(periodLast);
	
	System.out.println("Your Next Period Starts From " + nextPeriod);
	System.out.println("And It Ends At " + endPeriod);

	


	

	



}
}