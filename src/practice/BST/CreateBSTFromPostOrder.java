package practice.BST;

/**
 * END ELEMENT WOULD BE THE ROOT ELEMENT AS IN POST ORDER TRAVERSAL BST.
 * 
 * FIND THE FIRST ELEMENT SMALLER THAN THE ROOT ELEMENT AND THEN RECURSIVELY
 * CONSTRUCT THE LEFT AND RIGHT TREE.s
 */
public class CreateBSTFromPostOrder {

		  
	public TreeNode createBST(int[] arr, int start, int end) {
		if (start > end) {
			return null;
		}

		TreeNode node = createNewNode(arr[end]);

		int i;
		for (i = end - 1; i >= start; i--) {
			if (arr[i] < node.data) {
				break;
			}
		}

		node.left = createBST(arr, start, i);
		node.right = createBST(arr, i + 1, end - 1);

		return node;
	}

	private TreeNode createNewNode(int i) {
		TreeNode node = new TreeNode();
		node.data = i;
		return node;
	}

}