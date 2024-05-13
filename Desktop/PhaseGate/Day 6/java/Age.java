ngimport java.util.*;
import java.time.*;

public class Age {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
	String userInput = " ";
	do{
	System.out.println("Enter Date Of Birth in DD-MM-YYYY");
	String dob = scanner.nextLine();
	userInput = dob.replace("-", "");
	}while(userInput.length() != 8);
	String result = date(userInput);
	System.out.print(result);
	}



	public static String date(String userInput) {
	String strDay = userInput.substring(0,2);
	int intDay = Integer.parseInt(strDay);
	String strMonth = userInput.substring(2,4);
	int intMonth = Integer.parseInt(strMonth);
	String strYear = userInput.substring(4,8);
	int intYear = Integer.parseInt(strYear);
	LocalDate today = LocalDate.now();
	int todayYear = today.getYear();
	Month month = today.getMonth();
	int todayMonth = month.getValue();
	LocalDateTime now = LocalDateTime.now();
	
	

	int age = 0;
	if (todayMonth < intMonth){
		age = todayYear - intYear - 1;
	}else{
		age = todayYear - intYear;
	}
	String strAge = Integer.toString(age);
	
return strAge;
}
}






 

