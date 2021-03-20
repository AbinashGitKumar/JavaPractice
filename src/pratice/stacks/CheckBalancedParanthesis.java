package pratice.stacks;

import java.util.Stack;

public class CheckBalancedParanthesis {

	public static void main(String[] args) {
		
		String str="{{([])}}";
		System.out.println(isBalancedParanthesis(str));
		
		String str2= "[{]";
		System.out.println(isBalancedParanthesis(str2));
		
	}

	static boolean isBalancedParanthesis(String str) {
		char ch[] = str.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i <= ch.length - 1; i++) {

			if (ch[i] == '{' || ch[i] == '[' || ch[i] == '(') {
				stack.push(ch[i]);
			} else if (ch[i] == '}' || ch[i] == ']' || ch[i] == ')') {
				char ele = stack.pop();

				if (ch[i] == '}' && ele != '{')
					return false;

				if (ch[i] == ')' && ele != '(')
					return false;

				if (ch[i] == ']' && ele != '[')
					return false;

			}
		}
		return true;
	}

}
