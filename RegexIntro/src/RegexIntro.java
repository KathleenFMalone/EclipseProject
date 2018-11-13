
public class RegexIntro {
	
	public static void main(String[] args) {
		
		
		String funkyString = "67_The_cow_jumped_over_the_moon!!!!";
		
		//check for a String with the phrase jumped
		//.* - matches 0 or more of any character
		//read the expression as 0 or more of any character followed by jumped
		//followed by 0 or more of any character
		boolean isAMatch = funkyString.matches(".*jumped.*");
		System.out.println("Contains jumped: "+isAMatch);
		
		
		//.+ - matches 1 or more of any character
		//read the expression as 0 or more of any character followed by !!!!
		//followed by 1 or more of any character
		//this is false because !!!! is the end of the String
		//it is not followed by anything
		isAMatch = funkyString.matches(".*!!!!.+");
		System.out.println("Contains !!!! followed by any character: "+isAMatch);
		
		//starts with a digit followed by 0 or more characters
		//^ - means starts with
		//\\d - matches a digit
		//read as "String starts with a digit followed by any character"
		isAMatch = funkyString.matches("^\\d.*");
		System.out.println("Starts with a digit: "+isAMatch);
		
		//this is false because !!!! is not a alphanumeric character
		// \\ digit
		// \\w any alphanumeric or underscore character
		//read as "A String that starts with a digit followed by alphanumeric
		//character
		isAMatch = funkyString.matches("^\\d\\w*");
		System.out.println("Digit followd by alphanumeric characters: "+isAMatch);
		
		//starts with a digit followed by any character and ends with non word
		//^ means starts with
		//? means ends with
		//read as "String starts with a digit followed by 0 or more characters
		//followed by an alphanumeric character
		isAMatch = funkyString.matches("^\\d.*\\W?");
		System.out.println("Starts with digit followd by any character and ending with non word character: "+isAMatch);
		
		String funkyString2 = "67_The_cow_jumped_over_the_moon";
		//starts with a digit followed by 0 or more alphanumberic plus _ characters
		isAMatch = funkyString2.matches("^\\d\\w*");
		System.out.println("Starts with a digit followed by alphanumeric characters "+isAMatch);
	}

}
