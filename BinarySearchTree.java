package test;

import test.SinglyLinkedList.Node;

public class BinarySearchTree {
	Node root = null;
	
	class Node{
		int key;
		Node left, right;
		Node(int data){
			key = data;
			left = right = null;
		}
	}
	void insert(int key) 
	{
		root = insert(root, key);
	}
	Node insert(Node root, int key) 
	{
		if(root == null) return new Node(key);
		if(root.key < key)
			root.right = insert(root.right, key);
		else if(root.key > key)
			root.left = insert(root.left, key);
		return root;
	}
	void remove(int key) 
	{
		root = remove(root, key);
	} 
	Node remove(Node root, int key) 
	{
		if(root == null) return null;
		if(root.key > key)
			root.left = remove(root.left, key);
		else if(root.key < key)
			root.right = remove(root.right, key);
		else 
		{
			if(root.left == null)
				return root.right;
			else if(root.right == null)
				return root.left;
			root.key = findMinKey(root.right);
			root.right = remove(root.right, root.key);
		}
		return root;
	}
	int findMinKey(Node root) 
	{
		int min = root.key;
		while(root.left != null) 
		{
			root = root.left;
			min = root.key;
		}
		return min;
	}
	void inorder() {
		inorder(root);
	}
	void inorder(Node root) {
		if(root == null) return;
		inorder(root.left);
		System.out.print(root.key+", ");
		inorder(root.right);
	}
	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		/* 
        50
     /     \
    30      70
   /  \    /  \
  20   40  60   80 */
		tree.insert(50);
		tree.insert(30);
		tree.insert(20);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		tree.inorder();     System.out.println();
		tree.remove(20);
		tree.inorder();		System.out.println();
		tree.remove(30);
		tree.inorder();		System.out.println();
		tree.remove(50);
		tree.inorder();		System.out.println();
	}
}