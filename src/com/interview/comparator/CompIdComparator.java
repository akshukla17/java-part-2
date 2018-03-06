package com.interview.comparator;

import java.util.Comparator;

public class CompIdComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int value=o1.getCompany().compareTo(o2.getCompany());
		if(value==0) {
			return o1.getId()-o2.getId();
		}
		return value;
	}
}
