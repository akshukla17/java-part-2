package com.interview.linkedList;

import java.util.Scanner;

import com.interview.linkedList.LinkedList.Node;

public class ReverseLinkedList {

	Node head;
	public static void main(String[] args) {
		ReverseLinkedList rList = new ReverseLinkedList();
		rList.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		Node sixth = new Node(6);
		rList.head.next = sec;
		sec.next = third;
		third.next=fourth;
		fourth.next=fifth;
		fifth.next=sixth;
		
		System.out.println("Print the node");
		LinkedList.printRecursion(rList.head);
		
		System.out.println("Kth element from last, enter the position");
		
		Scanner sc=new Scanner(System.in);
		int position=sc.nextInt();
		sc.close();
		int data=findNodeFromLast(rList.head,position);
		if(data==-1) {
		System.out.println("Given node position does not exist in the linked list");
		}else {
			System.out.println("Node data from last is : "+data);
		}
		
		rList.head=reverseList(rList.head);
		System.out.println("Reverse Linked List ");
		LinkedList.printRecursion(rList.head);
		

	}
	private static int findNodeFromLast(Node head, int position) {
		int count=1;
		//BEST way: get the node which distance from head is position. then iterate list till the node become null,
		//that time curr node will be at require position
		Node curr=head;
		Node post=head;
		while(count<=position) {
			post=post.next;
			count++;
		}
		while(post!=null) {
			curr=curr.next;
			post=post.next;
		}
		return curr.data;
		/* another way to do it
		 
		  if(head==null) return -1;
		Node curr=head;
		Node pNode=null;
		
		while(count<=position) {
			if(curr==null) {
				return -1;
			}
			curr=curr.next;
			count++;
		}
		pNode=curr;
		curr=head;
		while(pNode!=null) {
			pNode=pNode.next;
			curr=curr.next;
		}
		return curr.data;*/
	}
	private static Node reverseList(Node head) {
		Node pre=null;
		Node curr=head;
		Node next;
		if(head==null) return null;
		while(curr!=null) {
			next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}
		head=pre;
		return head;
	}

}
