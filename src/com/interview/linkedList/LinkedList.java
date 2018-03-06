package com.interview.linkedList;

import java.util.Scanner;

public class LinkedList {
	static Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			next = null;
		}
	}

	public static void main(String[] args) {
		LinkedList lsList = new LinkedList();
		lsList.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		lsList.head.next = sec;
		sec.next = third;
		boolean play = true;
		System.out.println("Print linked list:");
		printRecursion(lsList.head);
		Scanner sc = new Scanner(System.in);
		while (play) {
			System.out.println("\nwant to more LinkedList operation, \npress 1--> for node insertion,"
					+ "\n2 -- > delete node at given position, 3 --> print node data"
					+ "\n4-- > reverse the list"
					+ "\n5--> print list in reverse order");
			int choice = sc.nextInt();
			int value;
			int position;
			switch (choice) {
			
			case 1:
				System.out.println("node insertion-- enter the node data and its position in int(comma seperated)");
				String s=sc.next();
				String[]ss=s.split(",");
				value = Integer.valueOf(ss[0]);
				position=Integer.valueOf(ss[1]);
				lsList.head = insertNode(lsList.head, value,position);
				break;
			case 2:
				System.out.println("Node deletion -- enter the position of node");
				int nodePosition = sc.nextInt();
				lsList.head = deleteNodeAtGivenPosition(lsList.head, nodePosition);
				break;
			case 3:
				System.out.println("print node");
				printRecursion(lsList.head);
				break;
			case 4:
				System.out.println("Reverse the linked list");
				LinkedList revList=new LinkedList();
				revList.head=lsList.head;
				revList.head=reverseList(revList.head);
				printRecursion(revList.head);
				break;
			case 5:
				System.out.println("print linked list in reverse using recursion");
				printListInReverseOrder(lsList.head);
			case 6:
				System.out.println("Reverse Linked list using recursion, print");
				//printLinkedList(reverseListUsingRecursion(lsList.head));
			default:
					System.out.println("Sorry, you enter wrong number, try again");
			}
			System.out.println("\nwant to play again, enter --> true or false;");
			play = sc.nextBoolean();

		}
		System.out.println("Final node in the list are :: ");
		printRecursion(lsList.head);
		sc.close();
		

	}

	private static Node reverseListUsingRecursion(Node node) {
		if(node.next==null) {
			head=node;
			return head;
		}
		Node pre=node;
		
		 reverseListUsingRecursion(node.next);
		node.next=pre;
		return pre=null;
	}

	// case 5
	private static void printListInReverseOrder(Node head) {
		if(head==null) return;
		printListInReverseOrder(head.next);
		System.out.print("-->"+head.data);
	}

	private static Node reverseList(Node head) {
		if(head==null) {
			System.out.println("linked list is empty");
			return null;
		}
		Node pre=null;
		Node next;
		Node curr=head;
		while(curr!=null) {
			next=curr.next;
			curr.next=pre;
			pre=curr;
			curr=next;
		}
		head=pre;
		return head;
	}

	private static Node deleteNodeAtGivenPosition(Node head, int position) {
		if (head == null) {
			System.out.println("Error --------> Node must not be empty");
			return null;
		}
		Node curr = head;
		Node pre = null;
		int count = 1;
		if(position==1) {
			head=head.next;
			return head;
		}
		while (curr != null) {
			if (count == position) {
				if (pre != null) {
					pre.next = curr.next;
				} else {
					pre = curr.next;
				}
				break;
			}
			pre = curr;
			curr = curr.next;
			count++;
		}
		if(position>count) {
			System.out.println("Position is not found in the liked list, so no data deletion happend from list");
		}
		return head;
	}

	private static Node insertNode(Node head, int value,int position) {
		Node node = new Node(value);
		if (head == null) {
			if(position==1)return node;
			else {System.out.println("node is empty, need to insert data at position 1");
				return null;
			}
		}
		int count =0;
		Node curr = head;
		Node pre=null;
		if(position==0) {
			node.next=head;
			head=node;
			return node;
		}
		while (curr != null && position>count) {
			count++;
			pre=curr;
			curr = curr.next;

		}
		if(position==count) {
			pre.next=node;
			node.next=curr;
		}else if(position>count){
			System.out.println("This position is not avaiable, so no node insertion happend");
		}
		
		return head;
	}

	public static void printRecursion(Node node) {
		if(node==null) return ;
		System.out.print("-->"+node.data);
		printRecursion(node.next);
	}
	public static void printLinkedList(Node node) {
		if (node == null)
			System.out.println("Given node is empty");
		while (node != null) {
			System.out.print(node.data + " ->");
			node = node.next;
		}
	}

}
