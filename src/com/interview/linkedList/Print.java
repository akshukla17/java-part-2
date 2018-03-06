package com.interview.linkedList;

public class Print {
	public static void printNode(Node node) {
		while(node!=null) {
			System.out.print(node.data+"-->");
			node=node.next;
		}
		
	}

	public static void printNode(StringLL node) {
		while(node!=null) {
			System.out.print(node.ch+"-->");
			node=node.next;
		}
		
	}

}
