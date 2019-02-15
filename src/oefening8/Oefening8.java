package oefening8;

import java.util.Scanner;

public class Oefening8 {
	public static void main(String[] args) {
		
		Test functions = new Test();
		Scanner scanner = new Scanner(System.in);
		
		double input = scanner.nextDouble();
		scanner.close();

		functions.countDecimals(input);
	}
}