package pratice.stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestGreatestToLeft {

	public static void main(String[] args) {
		int arr[] = {2,3,6,1,6,9,7};
		nearestGreatestToLeft(arr);
	}
	
	static List<Integer> nearestGreatestToLeft(int arr[]) {
		Stack<Integer> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= arr.length - 1; i++) {
			if (stack.isEmpty()) {
				list.add(-1);
			} else {
				while (!stack.isEmpty() && stack.peek() < arr[i]) {
					stack.pop();
				}
				if (stack.isEmpty()) {
					list.add(-1);
				} else if (stack.peek() > arr[i]) {
					list.add(stack.peek());
				}
			}
			stack.push(arr[i]);
		}
		return list;
	}
}
