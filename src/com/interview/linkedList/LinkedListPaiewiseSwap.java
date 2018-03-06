package com.interview.linkedList;

public class LinkedListPaiewiseSwap {
	static Node head;
	public static void main(String[] args) {
		LinkedListPaiewiseSwap pairSwap=new LinkedListPaiewiseSwap();
		Node one=new Node(1);
		Node two=new Node(2);
		Node three=new Node(3);
		Node four=new Node(4);
		Node five=new Node(5);
		Node six=new Node(6);
		Node seven=new Node(7);
		//Node eight=new Node(8);
		head=one;
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=five;
		five.next=six;
		six.next=seven;
		//seven.next=eight;
		Print.printNode(head);
		//head=swapLinkData(head);
		System.out.println();
		//Print.printNode(head);
		head=swapLinkNode(head);
		System.out.println();
		Print.printNode(head);
	}
	//swapping the node link instead of data.
	//ex: 1->2->3->4->5->null
	//output: 2->1->4->3->5->null
	private static Node swapLinkNode(Node node) {
		Node curr=node;
		Node pre = node;
		curr=node.next;
		node=curr;
		while(true) {
			Node post=curr.next;
			curr.next=pre;
			if(post==null || post.next==null) {
				pre.next=post;
				break;
			}
			pre.next=post.next;
			pre=post;
			curr=pre.next;
		}
		return node;
	}
	// swapping data between two node, not swapping link
	private static Node swapLinkData(Node head) {
		if(head==null) return null;
		Node curr=head;
		while(curr!=null && curr.next!=null) {
			swap(curr,curr.next);
			curr=curr.next.next;
		}
		return head; 
	}
	private static void swap(Node curr, Node next) {
		int tmp=curr.data;
		curr.data=next.data;
		next.data=tmp;
		
	}
	private void push(int data) {
		Node n=new Node(data);
		n.next=head;
		head=n;
	}

}