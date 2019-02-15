package practiceassignments;

public class getOSInfo {

	public static void main(String[] args) {
	
		System.out.println(Specs());
	}
	
	private static String Specs() {
		
		String osArch = System.getProperty("os.arch");
		String osVersion = System.getProperty("os.version");
		String osName = System.getProperty("os.name");
		
		String Specs = ("Your CPU architecture = "+osArch+"\nYour operating system = "+osName+"\nYour operating system version = "+osVersion);
		return Specs;
	}
}
