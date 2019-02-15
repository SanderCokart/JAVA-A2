package Final;

import java.util.Scanner;

public class Fibanacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		Fibonacci(input);
		scanner.close();
	}

	private static void Fibonacci(String inputString) {

		int input = Integer.parseInt(inputString);
		int previous = -1;
		int result = 1;
		int sum = 0;
		int[] resultarray = new int[80];

		for (int i = 0; i <= input; i++) {
			sum = previous + result;
			previous = result;
			result = sum;
			resultarray[i] = result;

			System.out.println("Element "+i+" = " + resultarray[i]);
		}
		System.out.println();
		System.out.print("the squence is = ");
		for (int j = 0; j <= input; j++) {
			System.out.print(resultarray[j] + ", ");
		}
	}

}
