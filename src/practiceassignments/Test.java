package practiceassignments;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		double d = scanner.nextDouble();
		scanner.close();
		String text = Double.toString(Math.abs(d));
		int integerPlaces = text.indexOf('.');
		int decimalPlaces = text.length() - integerPlaces - 1;
		System.out.println(decimalPlaces);
	}
}
