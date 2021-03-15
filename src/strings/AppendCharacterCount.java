package strings;

public class AppendCharacterCount {

	public static void main(String[] args) {
		String str="aaabbcccd";
		System.out.println(appendCharCount(str));
	}
	
	
	//aab
	public static String appendCharCount(String str) {
		char ch[] = str.toCharArray();
		int counter = 1;
		StringBuilder otpString = new StringBuilder();
		for (int i = 0; i <= ch.length - 1; i++) {
			// Last Element , i+1 = ch.length means last element is getting executed.
			if (i + 1 == ch.length) {
				otpString.append(ch[i]).append(counter);
			}
			else if (ch[i] == ch[i + 1]) {
				counter++;
			} else {
				otpString.append(ch[i]).append(counter);
				counter = 1;
			}
		}
		return otpString.toString();
	}
}
