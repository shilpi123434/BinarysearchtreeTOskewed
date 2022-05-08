package com.skewedTree.driver;

public class Node1{
	
	

private static Object Node1;
public Node1 left;
public Node1 right;

public Node1() {
		// TODO Auto-generated constructor stub
	}

public static void main (String[] args) 

{

   
    Skt tree = new Skt();

    tree.Node1 = new Node1();

    tree.Node1.left = new Node1();

    tree.Node1.right = new Node1();

   

    int order = 0;

    BTToSkewed(Node1, order);

    traverseRightSkewed(headNode1);

}

private static void BTToSkewed(Object node12, int order) {
	// TODO Auto-generated method stub
	
}
}
