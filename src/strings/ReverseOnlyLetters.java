package strings;

import java.util.Stack;


public class ReverseOnlyLetters {

		public static void main(String[] args) {
			String str ="Testing-LeetCode*01";
			System.out.println(getReverseStringOnlyForLetters(str));
		}
		
	public static String getReverseStringOnlyForLetters(String str) {
		Stack<Character> stack = new Stack<>();
		StringBuilder revString=new StringBuilder();
		for (int i = 0; i <= str.length() - 1; i++) {
			
			if(Character.isLetter(str.charAt(i)))
			{
				stack.push(str.charAt(i));
			}
		}
		
		for(int i=0;i<=str.length()-1;i++)
		{
			if (Character.isLetter(str.charAt(i))) {
				revString.append(stack.pop());
			}
			else {
				revString.append(str.charAt(i));
			}
		}
		
		return revString.toString();
		
	}
	
}
