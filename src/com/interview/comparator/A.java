package com.interview.comparator;

class C {
	public int add(String a) {
		System.out.println("hi");
		return 0;
	}
	/*public void add(Object b) {
		System.out.println("object");
	}*/

}
class B extends C{
	public int add(String a) {
		System.out.println("B");
		return 0;
		
	}
}

public class A{
	public static void main(String[] args) {
		C b= new B();
	//	b.add(12);
	}
}
