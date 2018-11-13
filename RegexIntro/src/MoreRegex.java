
public class MoreRegex {
	
	public static void main(String[] args) {
		
		//read 1 or more digits, followed by 1 or more letters, followed by 1 or more digits
		String funkyString = "1247TheBigRedDog7777.*!";
		boolean isAMatch = funkyString.matches("\\d+[a-zA-z]+\\d+\\W+");
		System.out.println(isAMatch);
		
		//replace and replaceAll methods in the String class also use regex
		String removeDigits = funkyString.replaceAll("\\d", "");
		System.out.println("String no digits: "+removeDigits);
		
		String justNonLetters = funkyString.replaceAll("[a-zA-z]", "");
		System.out.println("String no letters: "+justNonLetters);	
		
		String justLetters = funkyString.replaceAll("[^a-zA-z]", "");
		System.out.println("String just letters: "+justLetters);	
		
	}

}
