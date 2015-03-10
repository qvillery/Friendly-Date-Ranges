import java.util.Scanner;
public class FriendlyDateRanges {
	public static String [] months = {"January", "Febuary", "March", "April", "May", "June", "July",
	"August", "September", "October", "November", "December"		
	};
	public static String [] suffix = { "st", "nd", "rd", "th", "th", "th", "th", "th", "th", "th", "th",
			 "th", "th", "th", "th", "th", "th", "th", "th", "th", "st", "nd", "rd",  "th", "th",
			 "th", "th", "th", "th", "th", "st"};


	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a date in the following format: YYYY-MM-DD");
		String date = input.nextLine();
		input.close();
		FriendlyDate(date);
		
	}
	
	public static void FriendlyDate (String currDate){
		
		
	}

}
