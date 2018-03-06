package com.interview.string;

/*
 * print substring without duplicate character 
 */
public class LargestSubString {

	public static void main(String[] args) {
		String input = "ajaykumarshukla";
		System.out.println("largest sub string : "+findLargestSubString(input));
	}

	private static String findLargestSubString(String input) {
		// first character of string
		String pre = input.substring(0, 1);
		String max = pre;
		int index = 0;
		int j = 1;
		// iterate string from index 1
		for (; j < input.length(); j++) {
			// find char at index j
			char indexChar = input.charAt(j);
			String charToString = String.valueOf(indexChar);
			// compare if this string is part of max string
			if (max.contains(charToString)) {
				// if current string length is greater than previous substring
				// then replace previous with this one else ignore
				if (pre.length() < max.length()) {
					pre = max;
				}
				index = max.lastIndexOf(charToString);
				int l = max.length();
				max = max.substring(index + 1, l);
				j = j - 1;
				continue;
			} else {
				// append it to max substring
				max = max + charToString;
			}
		}
		if (!max.contains(String.valueOf(input.charAt(j - 1)))) {
			max += String.valueOf(input.charAt(j));
		}
		return max.length() > pre.length() ? max : pre;
	}

}
