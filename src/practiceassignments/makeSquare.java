package practiceassignments;

import java.util.Scanner;

public class makeSquare {

	public static void main(String[] args) {

		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows = scanner.nextInt();
		System.out.println("Enter number of columns");
		int columns = scanner.nextInt();
		System.out.println("What would you like to render on the screen?");
		String symbol = scanner.next();
		scanner.close();
		
		
		createSquare(rows, columns, symbol);
	}

	private static void createSquare(int n1, int n2, String symbol) {
		
		for (int x = 0; x < n1; x++) {
			for (int y = 0; y < n2; y++) {
				System.out.print(symbol);
			}
			System.out.println();
		}
	}

}
