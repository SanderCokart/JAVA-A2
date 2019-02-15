package Final;

public class Opdracht2 {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		char[] weg = { '"', '?' };

		String tekst = "Dit is een tekst met \" en ** en ?? "
				+ "en allerlei andere niet wenselijke tekens zoals ® etc. ";

		Remove(tekst);
	}

	private static void Remove(String inputString) {
		
		String output = inputString.replaceAll("[\\*\\?®\"]", "");
		System.out.println(new String(output).trim().replaceAll("\\s{2,}", " "));				
	}

}