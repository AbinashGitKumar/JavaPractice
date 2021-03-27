package practice.BST.createBSTFromPreOrder;

public class CreateBSTFromPreOrder {

		  
		  public Node createBST(int[] arr, int start, int end) {
		    if(start > end) {
		      return null;
		    }
		    
		    Node node = createNewNode(arr[start]);
		    
		    int i;
		    for(i = start + 1; i <= end; i++) {
		      if(arr[i] > node.data) {
		        break;
		      }
		    }
		    
		    node.left = createBST(arr, start + 1, i - 1);
		    node.right = createBST(arr, i, end);
		     
		    return node;
		  }
		  
	private Node createNewNode(int i) {
		Node node = new Node();
		node.data = i;
		return node;
	}

		static class Node {
				 int data;
				 Node left;
				 Node right;
		  }


}
 

		  