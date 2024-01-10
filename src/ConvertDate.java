
import java.util.Scanner;

public class ConvertDate {

	public static void main(String[] args) {
		
		String shortDate = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a short date (YYYY-MM-DD): ");
        shortDate = scanner.nextLine();
        
        scanner.close();
        String[] date = shortDate.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        
        String monthName = getMonth(month);

        
        System.out.println(monthName + " " + day + ", " + year);
        
	}
	private static String getMonth(int month) {
        String[] monthNames = {
            "January", "February", "March", "April",
            "May", "June", "July", "August",
            "September", "October", "November", "December"
        };

        if (month >= 1 && month <= 12) {
            return monthNames[month - 1];
        } else {
            return "Invalid Month";
        }
    }

}
