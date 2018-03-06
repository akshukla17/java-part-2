package com.interview.random;

import java.util.Arrays;
import java.util.List;

public class Iterator {

	public static void main(String[] args) {

		List<String> ls=Arrays.asList("ajay","vijay","rajesh","shyam");
		ls.forEach(name ->System.out.println(name));
	}

}
