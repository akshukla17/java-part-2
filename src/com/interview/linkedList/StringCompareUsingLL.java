package com.interview.linkedList;

import java.util.Scanner;

//Compare two strings represented as linked lists
/*
 	Input: list1 = g->e->e->k->s->a
       list2 = g->e->e->k->s->b
Output: -1

Input: list1 = g->e->e->k->s->a
       list2 = g->e->e->k->s
Output: 1

Input: list1 = g->e->e->k->s
       list2 = g->e->e->k->s
Output: 0
 */
public class StringCompareUsingLL {
	static StringLL head;
	static StringLL head2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string and second string seperated by comma");
		String input = sc.nextLine();
		sc.close();
		String[] splitter = input.split(",");
		if (splitter.length > 2) {
			System.out.println("sorry, we expect only 2 comma seperated string");
		} else if (splitter.length == 2) {
			for (Character c : splitter[0].toCharArray()) {
				StringLL firstLL = new StringLL();
				head = firstLL.push(c, head);
			}
			for (Character c : splitter[1].toCharArray()) {
				StringLL firstLL = new StringLL();
				head2 = firstLL.push(c, head2);
			}

		}
		System.out.println("print characters ");
		Print.printNode(head);
		System.out.println();
		Print.printNode(head2);
		System.out.println();
		int value=stringCompare(head,head2);
		if(value>0) {
			System.out.println("first Linked List is greater from second Linked List");
		}else if(value<0) {
			System.out.println("first Linked List is less from second Linked List");
		}else if(value==0) {
			System.out.println("first Linked List is equal to second Linked List");
		}
			
	}

	private static int stringCompare(StringLL head, StringLL head2) {
		while(head!=null && head2!=null && head.ch==head2.ch) {
			head=head.next;
			head2=head2.next;
		}
		if(head!=null && head2!=null) {
			return head.ch>head2.ch?1:-1;
		}
		if(head==null && head2!=null) return -1;
		if(head2==null && head!=null) return 1;
	return 0;
	}
}

class StringLL {
	char ch;
	StringLL next;

	public StringLL() {

	}

	public StringLL(char c) {
		this.ch = c;
		next = null;
	}

	public StringLL push(char c, StringLL head) {
		StringLL curr=null;
		StringLL node = new StringLL(c);
		if(head==null) {
			return node; 
		}else {
			curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=node;
		return head;
		}
	}

}
