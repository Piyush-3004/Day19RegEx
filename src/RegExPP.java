
import java.util.regex.*;
public class RegExPP {
	
	public static boolean matchFirstName(String str) {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public static boolean matchLastName(String str) {
		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public static boolean matchEmail(String str) {
		Pattern p = Pattern.compile("^(.+)@[a-z]+(.)[a-z]+$");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public static boolean matchMobile(String str) {
		Pattern p = Pattern.compile("^(91)[ ][7-9]{1}[0-9]{9}$");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public static boolean matchPasswordmin8char(String str) {
		Pattern p = Pattern.compile("[a-zA-Z0-9]{8,}$");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public static boolean matchPasswordmin8charOneUpper(String str) {
		Pattern p = Pattern.compile("(?=.*[A-Z])[A-Za-z0-9]{8,}$");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public static boolean matchPasswordmin8charOneNumeric(String str) {
		Pattern p = Pattern.compile("(?=.*[0-9])[A-Za-z0-9]{8,}$");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	
	public static boolean matchPasswordmin8charExactyOnepecial(String str) {
		Pattern p = Pattern.compile("[A-Za-z0-9[#!@$%&]]+{8,}$");
		Matcher matcher=p.matcher(str);
		return matcher.matches();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(matchFirstName("Pinak"));
		System.out.println(matchFirstName("Patil"));
		System.out.println(matchEmail("Patil@g.com"));
		System.out.println(matchMobile("91 8011557471"));
		System.out.println(matchPasswordmin8char("piyush123"));
		System.out.println(matchPasswordmin8charOneUpper("Piyush123"));
		System.out.println(matchPasswordmin8charOneNumeric("piyush123"));
		System.out.println(matchPasswordmin8charExactyOnepecial("piyush12@3"));
		
	}

}
