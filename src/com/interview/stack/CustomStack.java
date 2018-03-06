package com.interview.stack;

public class CustomStack {
	static int capacity=10;
	static int top=-1;
	static int []stackArray;
	public CustomStack() {}
	public CustomStack(int size) {
		capacity=size;
		stackArray=new int[capacity];
	}
	public static boolean isEmpty() {
		if(top==-1) return true;
		else return false;
	}
	public void push(int data) throws Exception{
		if(top==capacity) {
			throw new Exception("sorry, stack is full");
		}else {
			stackArray[++top]=data;
		}
	}
	public void pop() throws Exception {
		if(top==-1)
			throw new Exception("Sorry, stack is empty");
		System.out.println(stackArray[top]+" is poped out from stack");
		top--;
	}
	public static int peek() {
		return stackArray[top];
	}
	public static void printStack() {
		for(int i=top;i>-1;i--) {
			System.out.print(stackArray[i]+" ");
		}
	}
	public static void main(String[] args) {
		CustomStack stack=new CustomStack(10);
		try {
			for(int i=0;i<10;i++) {
				stack.push(i*10);
			}
			System.out.println();
			System.out.println("stack data");
			stack.printStack();
			System.out.println();
			stack.pop();
			stack.pop();
			stack.pop();
			System.out.println("stack data");
			stack.printStack();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
