package com.naren.main;

public class Driver {
	
	/*Main class to create the tree*/
	static class Main
	{
		Node node;
		Node last=null;
		Node New=null;
		/*Method to convert BST A skewed tree*/
		void BSTtoSkewed(Node n)
		{
			if(n==null)
				return;
			/*loop until left of the leaf is reached*/
			BSTtoSkewed(n.left);
			Node rightNode=n.right;
			/*Change the old head to a new one*/
			if(New==null)
			{
				New=n;
				n.left=null;
				last=n;
			}
			else
			{
				/*update the right of predecessor and also the predecessor to accomodate next node*/
				last.right=n;
				n.left=null;
				last=n;
			}
			BSTtoSkewed(rightNode);
		}
		/*Looping until the all the data in the tree are displayed*/
		void disp(Node root)
		{
			if(root==null)
				return;
			System.out.print(root.nodeData + " ");
			disp(root.right);
		}
		/*Main code*/
		public static void main(String[] args) 
		{
			Main tree=new Main();
			tree.node=new Node(50);
			tree.node.left=new Node(30);
			tree.node.right=new Node(60);
			tree.node.left.left=new Node(10);
			tree.node.right.left=new Node(55);
			/*Calling the method to change BST to Skewed tree*/
			tree.BSTtoSkewed(tree.node);
			/*Displaying the contents of skewed tree*/
			tree.disp(tree.New);
		}
	}
}
