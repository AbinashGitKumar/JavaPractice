package practice.linkedlist;

public class LinkedListHasCycle {

	public static void main(String[] args) {
		
	}

	public static boolean isLinkedListCyclic(Node node) {
		if (node == null)
			return false;
		Node slow = node;
		Node fast = node.next;
		while (slow != fast) {
			if (fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

	static class Node {
		int data;
		Node next;
	}
	
	
}
