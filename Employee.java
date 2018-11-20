package com.code;

public class Employee {
	
	private int id;
	private String name;
	private float salary;
	public Employee(){}
	public Employee(int pId, String pName, float pSalary) {
		super();
		id = pId;
		name = pName;
		salary = pSalary;
	}
	public int getId() {
		return id;
	}
	public void setId(int pId) {
		id = pId;
	}
	public String getName() {
		return name;
	}
	public void setName(String pName) {
		name = pName;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float pSalary) {
		salary = pSalary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
