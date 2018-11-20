package com.code;

public class TestClone implements Cloneable{
	private String name;
	public TestClone(){}
	public TestClone(String name){
		this.name=name;
	}
	public static void main(String[] args) {
		TestClone t =new TestClone("test1");
		
		try { // will throw exception without implementing  CLoneable interface
			TestClone t2 = (TestClone) t.clone();
			System.out.println("clone object "+t2.getName());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String pName) {
		name = pName;
	}

}
