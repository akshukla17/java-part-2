package com.interview.comparator;

public class Employee {
	public Employee(int id, String name, double salary, String company) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.company = company;
	}
	public Employee() {}
	private int id;
	private String name;
	private double salary;
	private String company;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", company=" + company + "]";
	}
	

}
