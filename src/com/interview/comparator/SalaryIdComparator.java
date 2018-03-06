package com.interview.comparator;

import java.util.Comparator;

public class SalaryIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int value=(int)(o1.getSalary()-o2.getSalary());
		if(value==0) return o1.getId()-o2.getId();
		return value;
	}

}
