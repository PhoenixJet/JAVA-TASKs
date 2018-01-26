import java.text.*;
import java.util.*;

public class CalculateAge {
	public static void main(String[] args) {
		System.out.println("Enter your Date of Birth in format MM-dd-yyyy");
		Scanner input = new Scanner(System.in);
		String dateOfBirth = input.nextLine();
		System.out.println("Enter Current date in format MM-dd-yyyy");
		String currentDate = input.nextLine();
		try {
			Calendar cal1 = new GregorianCalendar();
			Calendar cal2 = new GregorianCalendar();
			int age = 0;
			int factor = 0;
			Date date1 = new SimpleDateFormat("MM-dd-yyyy").parse(dateOfBirth);
			Date date2 = new SimpleDateFormat("MM-dd-yyyy").parse(currentDate);
			cal1.setTime(date1);
			cal2.setTime(date2);
			if (cal2.get(Calendar.DAY_OF_YEAR) < cal1.get(Calendar.DAY_OF_YEAR)) {
				factor = -1;
			}
			age = cal2.get(Calendar.YEAR) - cal1.get(Calendar.YEAR) + factor;
			System.out.println("Your age is: " + age);
		} catch (ParseException e) {
			System.out.println(e);
		}
	}
}