package pratice.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestGreaterToRight {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 4 };
		getNearestGreaterToRight(arr);
	}

	static List<Integer> getNearestGreaterToRight(int arr[]) {
		Stack<Integer> stack = new Stack<>();
		List<Integer> list = new ArrayList<>();
		for (int j = arr.length - 1; j >= 0; j--) {

			if (stack.isEmpty()) {
				list.add(-1);
			} else {
				while (!stack.isEmpty() && stack.peek() < arr[j]) {
					stack.pop();
				}
				if (stack.isEmpty()) {
					list.add(-1);
				} else if (stack.peek() > arr[j]) {
					list.add(stack.peek());
				}
			}
			stack.push(arr[j]);
		}
		Collections.reverse(list);
		return list;
	}

}
