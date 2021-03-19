package practice.BST;

public class BinarySearchTreeToLinkedList {

	public static void main(String[] args) {
		
	}
	
	static int getMiddleNodeOfLinkedList(Node node)
	{
		Node slow =node;
		Node fast=node;
		
		if(node==null)
			return -1;
		
		
		while(fast!=null && fast.next!=null) {
		
			fast=node.next.next;
			slow=node.next;
		
		}
		return slow.data;
	}
	
	
	static class Node {
		
		int data;
		Node next;
	}
	
	
	
}
