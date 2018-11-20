package com.code;

public class MergeSortedLL {
	public static void main(String[] args) {
		LinkedList l1 = new LinkedList();
		LinkedList l2 = new LinkedList();
		l1.head = new Node(1);
		l1.head.next = new Node(4);
	//	l1.head.next.next = new Node(23);
		//l1.head.next.next.next = new Node(44);
		System.out.println("Printing l1 list");
		LinkedList.printLinkedList(l1.head);

		l2.head = new Node(2);
	//	l2.head.next = new Node(4);
		//l2.head.next.next = new Node(12);
		//l2.head.next.next.next = new Node(30);
		System.out.println("Printing l2 list");
		LinkedList.printLinkedList(l2.head);

		LinkedList l3 = new LinkedList();
		//l3.head = mergeSortedLinkedList(l1, l2);
		l3.head = recursiveMerging(l1.head, l2.head);
		System.out.println("Printing after merging ");
		LinkedList.printLinkedList(l3.head);
	}

	private static Node recursiveMerging(Node n1, Node n2) {
		Node n = null;
		if (n1 == null) {
			return n2;
		}
		if (n2 == null) {
			return n1;
		}
		while (n1 != null && n2 != null) {
			if (n1.data < n2.data) {
				n = new Node(n1.data);
				System.out.println("n1 <n2,   n1="+ n1.data +" , n2= "+n2.data+", n =");
				LinkedList.printLinkedList(n);
				n.next =recursiveMerging(n1.next, n2);
			} else {
				n = new Node(n2.data);	
				System.out.println("n1 > n2,   n1="+ n1.data +" , n2="+n2.data+", n =");
				LinkedList.printLinkedList(n);
				n.next =recursiveMerging(n1, n2.next);
			}
		}
		return n;
	}

	private static Node mergeSortedLinkedList(LinkedList l1, LinkedList l2) {
		LinkedList dummy = new LinkedList();
		if (l1.head == null) {
			dummy.head.next = l2.head;
			return dummy.head.next;
		}
		if (l2.head == null) {
			dummy.head.next = l1.head;
			return dummy.head.next;
		}
		Node n1 = l1.head;
		Node n2 = l2.head;
		dummy.head = new Node(-1);
		Node d = dummy.head;

		while (n1 != null && n2 != null) {
			if (n1.data < n2.data) {
				d.next = new Node(n1.data);
				n1 = n1.next;
			} else {
				d.next = new Node(n2.data);
				n2 = n2.next;
			}
			d = d.next;
		}
		while (n1 != null) {
			d.next = new Node(n1.data);
			n1 = n1.next;
			d = d.next;
		}
		while (n2 != null) {
			d.next = new Node(n2.data);
			n2 = n2.next;
			d = d.next;
		}

		return dummy.head.next;
	}

}

class LinkedList {
	Node head;

	public LinkedList() {
		this.head = null;
	}

	public static void printLinkedList(Node pHead) {
		Node tmp = pHead;
		System.out.print("Head > ");
		while (tmp != null) {
			System.out.print(tmp.data + " >");
			tmp = tmp.next;
		}
		System.out.println();
	}

	public Node addNode(Node node, int data) {
		if (node == null)
			return new Node(data);
		else {
			Node tmp = node;
			while (tmp != null) {
				tmp = tmp.next;
			}
			tmp = new Node(data);
			return node;
		}
	}
}

class Node {
	int data;
	Node next;

	Node(int d) {
		this.data = d;
		this.next = null;
	}
}