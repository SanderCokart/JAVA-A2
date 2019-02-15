package practiceassignments;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class evenNumberV2 {

	public static void main(String[] args) {
		if (evenDate()) {
			System.out.print("The date is " + LocalDate.now() + " The day is even");
		} else {
			System.out.println("The date is " + LocalDate.now() + " The day is uneven");
		}
	}

	private static boolean evenDate() {
		String dateString = LocalDate.now().format(DateTimeFormatter.ofPattern("dd"));
		int date = Integer.parseInt(dateString);
		
		if(date % 2 > 0) {
			return false;
		} else {
			return true;
		}
		
	}
}
