package practiceassignments;

import java.util.Scanner;

public class getMaximum {

	public static void main(String[] args) {

		int[] values = new int[10];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter some numbers");
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
			if(values[i] == 0)
				scanner.close();
		}
		System.out.println(getMax(values));
	}

	private static int getMax(int[] input) {
		 
		int max = 0;
		
		for(int i = 0; i < input.length; i++) {
			if(input[i] > max)
				max = input[i];
		}
		return max;
	}

}