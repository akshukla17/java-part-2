package com.interview.string;

import java.util.ArrayList;

public class StringPermutation2 {

	public static void main(String[] args) {
		String s="aabc";
		ArrayList<String>results=permutations(s);
		for(int i=0;i<results.size();i++) {
			System.out.println(results.get(i));
		}
	}

	public  static ArrayList<String> permutations(String s) {
		ArrayList<String> results=new ArrayList<>();
		permutations("",s,results);
		return results;
	}

	private static void permutations(String prefix, String suffix, ArrayList<String> results) {
		if(suffix.length()==0) {
			results.add(prefix);
		}else {
			for(int i=0;i<suffix.length();i++) {
				System.out.println("prefix+suffix.charAt(i) --"+(prefix+suffix.charAt(i)));
				System.out.println("suffix.substring(0, i)+suffix.substring(i+1,suffix.length()) --"
				+(suffix.substring(0, i)+suffix.substring(i+1,suffix.length())));
				
				permutations(prefix+suffix.charAt(i),
						suffix.substring(0, i)+suffix.substring(i+1,suffix.length()), results);
			}
		}
	}

}
