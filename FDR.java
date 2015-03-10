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
		String [] arrDate = currDate1.split("-");
		String [] arrDate2 = currDate2.split("-");
		int year1 = Integer.parseInt(arrDate[0]);
		int year2 = Integer.parseInt(arrDate2[0]);
		int month1 = Integer.parseInt(arrDate[1]);
		int month2 = Integer.parseInt(arrDate2[1]);
		int day1 = Integer.parseInt(arrDate[2]);
		int day2 = Integer.parseInt(arrDate2[2]);
		
		int yearDiff = year2 - year1;
		int monthDiff = month2 - month1;
		int dayDiff = day2 - day1;
		if (yearDiff == 0 && monthDiff == 0 && dayDiff != 0 ) {
			System.out.println(months[month1 -1] + " " + day1 + suffix[day1 -1] + " - " + day2 + suffix[day2-1]);
		}
		else if (yearDiff == 0 && monthDiff == 0 && dayDiff == 0 ) {
			System.out.println(months[month1-1] + " " + day1 + suffix[day1-1] + ", " + year1);
		}
		
		else if (yearDiff == 1 && monthDiff==0 || yearDiff == 1 && monthDiff == 0 && dayDiff < 1) {
			System.out.println(months[month1-1] + " " + day1 + suffix[day1 -1] + ", " + year1 +" - "+ months[month2-1] 
						+" "+ day2 + suffix[day2-1] + ", " + year2);
		}
		
		else if (yearDiff == 0 && monthDiff > 1 && dayDiff != 0 ) {
			System.out.println(months[month1-1] + " " + day1 + suffix[day1-1] + " - " + months[month2-1]
					+ " " + day2 + suffix[day2-1] + ", " + year2);
		}
		else if (yearDiff == 1 && monthDiff < 12) {
			System.out.println(months[month1-1] + " " + day1 + suffix[day1-1] + " - " + months[month2-1]
					+ " " + day2 + suffix[day2-1]);
		}
			
		else {
			System.out.println(months[month1-1] + " " + day1 + suffix[day1-1] + ", " + year1 +
					" - " + months[month2-1] + " " + day2 + suffix[day2-1] + ", " + year2);
		}
		
		
	}

		
	}

}
