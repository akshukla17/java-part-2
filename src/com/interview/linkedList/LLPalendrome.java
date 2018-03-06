package com.interview.linkedList;

import java.util.Scanner;

public class LLPalendrome {
	static Node head;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number with comma seperated");
		String input=sc.nextLine();
		sc.close();
		String[] strArr=input.split(",");
		for(String s:strArr) {
			head=insertNodeAtEnd(Integer.valueOf(s),head);
		}
		Print.printNode(head);
		boolean isPalendrome=checkPalendrome(head);
	}
	public static boolean checkPalendrome(Node head) {
		if(head==null) return false;
		//find middle of linked list
		Node slow=head;
		Node preSlow=null;
		Node fast=head;
		//Node middle=
		while(fast!=null && fast.next!=null) {
			preSlow=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		if(fast.next==null) {
			
		}
		return false;
	}
	public static Node insertNodeAtEnd(int data, Node head) {
		Node node=new Node(data);
		if(head==null) return node;
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=node;
		return head;
	}

}
