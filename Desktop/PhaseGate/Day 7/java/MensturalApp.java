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
	
	LocalDate nextPeriod = date.plusDays(cycle);

	LocalDate endPeriod = nextPeriod.plusDays(periodLast);

	LocalDate ovulation = endPeriod.addDays(14);

	LocalDate ovulationEnd = ovulation.plusDays(5);
	
	System.out.println("Your Next Period Starts From " + nextPeriod + " and It ends At " + endPeriod);
	System.out.println();

	System.out.println("Your Ovulation(fertiledays) Starts From " + ovulation + " and your Ovulation(fertiledays) ends At " + ovulationEnd);


	

	


	

	



}
}