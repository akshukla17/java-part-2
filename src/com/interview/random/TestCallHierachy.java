package com.interview.random;

public class TestCallHierachy {

	public static void main(String[] args) {

		//B b=(B) new A();
		A b=new A();
		b.add("OOOOOOOOOOOO");
	}

}
class A{
	public void add(String a) {
		System.out.println(" Hi "+a);
	}
	public void add(Object o) {
		System.out.println(" object "+o);
	}
}

class B extends A{
	public void add(String b) {
		System.out.println("B: "+b);
	}
}
