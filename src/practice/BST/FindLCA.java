package practice.BST;

public class FindLCA {
	 
	public Node findLowestCommonAncestor(Node node , int n1 , int n2) {
	if(node == null) {
	      return null;
	    }
	    
	    while(node != null) {
	      if(node.data > n1 && node.data > n2) {
	        node = node.left;
	      } else if(node.data < n1 && node.data < n2) {
	        node = node.right;
	      } else {
	        break;
	      }
	    }
	    return node;
	}
	    
	static class Node {
		  Node left;
		  Node right;
		  int data;
		} 
	    
}

