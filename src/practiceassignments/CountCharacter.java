package practiceassignments;

import java.util.Scanner;

public class CountCharacter {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word");
		String scan0 = scanner.next();
		System.out.println("Enter a character that you wish to be counted");
		String scan1 = scanner.next();
		scanner.close();

		countChar(scan0, scan1);

	}

	private static void countChar(String inputString, String inputChar) {

		int counter = 0;
		char charArray[] = inputString.toCharArray();
		char character = inputChar.charAt(0);

		for (int i = 0; i < inputString.length(); i++) {
			if (character == charArray[i]) {
				counter++;
			}
		}
		System.out.println("Counter: "+counter);

	}

}
