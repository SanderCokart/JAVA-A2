package practiceassignments;

import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scanner.nextLine();
		scanner.close();
		
		
		reverseString(input);
	}
	
	private static void reverseString(String input) {
		String reversedString = "";

		for(int i = input.length()-1; i >= 0;i--) {
			reversedString = reversedString + input.charAt(i);
		}
		System.out.println("Your reversed string is: "+reversedString);
	}
	
}
