package practiceassignments;

import java.time.LocalDate;
import java.util.Date;

public class evenNumber {

	public static void main(String[] args) {
		if (evenDate()) {
			System.out.print("The date is " + LocalDate.now() + " The day is even");
		} else {
			System.out.println("The date is " + LocalDate.now() + " The day is uneven");
		}
	}

	private static boolean evenDate() {
		Date date = new Date();
		@SuppressWarnings("deprecation")
		int today = (int) date.getDate();
		if (today % 2 > 0) {
			return false;
		} else {
			return true;
		}
	}

}
