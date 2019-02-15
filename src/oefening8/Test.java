package oefening8;

public class Test {
	public boolean containsNumbers(String input) {

		if (input.matches(".*\\d+.*")) {
			return true;
		} else {
			return false;
		}

	}

	public String getNumbers(String input) {

		String output = input.replaceAll("\\D+", "");

		return output;
	}
	
	public int countDecimals(double input) {
		
		String text = Double.toString(Math.abs(input));
		int integerPlaces = text.indexOf('.');
		int decimalPlaces = text.length() - integerPlaces - 1;
		return decimalPlaces;
	}
	
}
