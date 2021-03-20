package pratice.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseListUsingStack {

	public static void main(String[] args) {
		List<String> list =new ArrayList<String> ();
		list.add("Abinash");
		list.add("Atul");
		list.add("Pravin");
		System.out.println(reverseList(list));
	}
	
	static List<String> reverseList(List<String> list) {
		Stack<String> stack = new Stack<String>();
		list.stream().forEach(str -> stack.push(str));
		list.clear();
		while (!stack.isEmpty()) {
			list.add(stack.pop());
		}
		return list;
	}
	
	
}
