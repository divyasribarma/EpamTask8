package epam.TddJunit;

public class DeleteA
{
	
	public static String remove(String string) {
		String result ="";
		int stringLength = string.length();
		if(stringLength >= 1 && string.charAt(0) != 'a' && string.charAt(0) != 'A') {
			result += string.charAt(0);
		}
		if(stringLength >= 2 && string.charAt(1) != 'a' && string.charAt(1) != 'A') {
			result += string.charAt(1);
		}
		if(stringLength > 2) {
			result += string.substring(2);
		}
		return result;
	}
}
