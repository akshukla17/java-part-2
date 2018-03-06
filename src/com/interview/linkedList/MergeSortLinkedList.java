package com.interview.linkedList;

public class MergeSortLinkedList {
	static Node head;
	static Node head2;
	public static void main(String[] args) {

		Node one=new Node(1);
		Node three=new Node(3);
		Node six=new Node(623);
		Node seven=new Node(700);
		head=one;
		one.next=three;
		three.next=six;
		six.next=seven;

		Node first=new Node(11);
		Node sec=new Node(23);
		Node third=new Node(123);
		Node fo=new Node(4234);
		
		
		head2=first;
		first.next=sec;
		sec.next=third;
		third.next=fo;
		
		Print.printNode(head);
		System.out.println();
		Print.printNode(head2);
		
		Node mergeNode=mergeSortedLinkedList(head,head2);
		System.out.println("merge list");
		Print.printNode(mergeNode);
	}
	private static Node mergeSortedLinkedList(Node node, Node node2) {
		Node result=null;
		if(node==null) return node2;
		if(node2==null) return node;
			if(node.data>=node2.data) {
				result=node2;
				result.next=mergeSortedLinkedList(node, node2.next);
			}else {
				result=node;
				result.next=mergeSortedLinkedList(node.next, node2);
			}
			
		return result;
		
	}

}
