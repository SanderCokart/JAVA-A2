package Final;

public class Opdracht2 {
	
	public static void main(String[] args) {

		String tekst = "Dit is een tekst met \" en ** en ?? "
				+ "en allerlei andere niet wenselijke tekens zoals ® etc. ";

		Remove(tekst);
	}

	private static void Remove(String inputString) {
		
		String output = inputString.replaceAll("[\\*\\?®\"]", "");
		System.out.println(new String(output).trim().replaceAll("\\s{2,}", " "));				
	}

}