package practice.binarytree;

public class InvertBinaryTree {

	public Node invertTheBinaryTree(Node node) {
		if (node == null)
			return node;
		Node left = invertTheBinaryTree(node.left);
		Node right = invertTheBinaryTree(node.right);
		node.left = right;
		node.right = left;
		return node;
	}

	static class Node {
		Node left;
		Node right;
		int data;
	}

}
