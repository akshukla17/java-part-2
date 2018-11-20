package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestComparator {
	public static void main(String[] args) {
		Employee e1 =new Employee(1,"ajay",27);
		Employee e2 =new Employee(1,"ram",2113444);
		Employee e3 =new Employee(12,"jay",24);
		List<Employee> ls =new ArrayList<>();
		ls.add(e1);
		ls.add(e3);
		ls.add(e2);
		Collections.sort(ls, EmpComparator.salaryBased);
		System.out.println("Salary based comarator");
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i).toString());
		}

		Collections.sort(ls, EmpComparator.nameBased);
		System.out.println("Name based comarator");
		for(int i=0;i<ls.size();i++){
			System.out.println(ls.get(i).toString());
		}
		

	}

}
