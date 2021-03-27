package practice.BST;

public class ConvertSortedArrayToBST {

	
	/**
	 *  Construct Sorted Array to BST.
	 */
	public static TreeNode constructBSTFromArray(int nums[], int left, int right) {
		if (left > right) {
			return null;
		}
		int mid = left + (right - left) / 2;
		TreeNode node = new TreeNode();
		node.data = nums[mid];
		node.left = constructBSTFromArray(nums, left, mid - 1);
		node.right = constructBSTFromArray(nums, mid + 1, right);
		return node;
	}	
	
}

class TreeNode {
	int data;
	TreeNode left;
	TreeNode right;
}
