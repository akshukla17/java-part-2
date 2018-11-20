package com.code;

import java.util.Comparator;

public class EmpComparator {
	
	public static Comparator<Employee> salaryBased = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return (int) (e1.getSalary() - e2.getSalary());
		}
	}; 
	
	
	public static Comparator<Employee> nameBased = new Comparator<Employee>() {

		@Override
		public int compare(Employee e1, Employee e2) {
			return e1.getName().compareTo(e2.getName());
		}
	};

}
