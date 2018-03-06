package com.interview.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {

	public static void main(String[] args) {

		Employee e=new Employee(1, "krishna", 34999, "x");
		Employee e2=new Employee(12, "krishna", 34999, "y");
		Employee e3=new Employee(10, "ram", 45001, "x");
		Employee e4=new Employee(1, "radha", 32145, "y");
		Employee e5=new Employee(201, "shah", 45001, "y");
		List<Employee> ls=new ArrayList<>();
		ls.add(e5);
		ls.add(e4);
		ls.add(e3);
		ls.add(e);
		ls.add(e2);
		
		Collections.sort(ls, new SalaryIdComparator());
		System.out.println("sort employee based on salary and Id");
		ls.stream().forEach(emp -> System.out.println(emp));
		System.out.println("print employee whose salary is less than 40000");
		ls.stream().filter(emp -> emp.getSalary()<40000).forEach(emp -> System.out.println(emp));
		
		Collections.sort(ls,new NameComparator());
		System.out.println("sort employee based on the name");
		ls.stream().forEach(emp -> System.out.println(emp));
		
		Collections.sort(ls,new CompIdComparator());
		System.out.println("sort based on company and Id of employee");
		ls.stream().forEach(emp -> System.out.println(emp));
	}

}
