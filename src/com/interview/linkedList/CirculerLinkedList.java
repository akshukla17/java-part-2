package com.interview.linkedList;

public class CirculerLinkedList {
  static Node head;
	public static void main(String[] args) {
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		Node six=new Node(6);
		Node seven=new Node(7);
		Node found=null;
		Node remNode=null;
		head=one;
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		five.next=seven;
		seven.next=six;
		six.next=three;
		
		detectLoop(head);
				
	}
	
	private static void removeLoop(Node found, Node head) {
		Node curr=head;
		Node loopNode=found;
		Node pre=null;
		while(loopNode!=curr) {
			pre=loopNode;
			loopNode=loopNode.next;
			curr=curr.next;
		}
		pre.next=null;
		System.out.println("After removing loop, iterate linked list");
		Print.printNode(head);
	}
	private static Node detectLoop(Node head) {
		Node curr=head;
		Node slow=curr;
		Node fast=head;
		while(slow!=null && fast!=null && fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast) {
				System.out.println("loop detected ");
				removeLoop(slow, head);
				return slow;
			}
		}
		System.out.println("no loop found");
		return null;
	}

}
class Node{
	int data;
	Node next;
	public Node(int d) {
		this.data=d;
		this.next=null;
	}
}
