package practice.binarytree.levelOrderTraversal;

import java.util.PriorityQueue;
import java.util.Queue;

public class LevelOrderTraversalUsingQueue {

	
	static class Node {
		Node left;
		Node right;
		int data;
	}
	
	static void printLevelOrderTraversal(Node node) {
		Queue<Node> queue = new PriorityQueue<Node>();
		queue.add(node);
		if(node==null)
		{
			return ;
		}
		
		while(!queue.isEmpty())
		{
			
			System.out.println(node.data);
		
			if(node.left!=null)
			queue.add(node.left);
			
			
			if(node.right!=null)
			queue.add(node.right);
			
		}
		
		
	}
	
	
	
	
}
