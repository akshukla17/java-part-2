package com.interview.string;

public class PamendromeRecur {

	public static void main(String[] args) {

		String s="addaaa";
		System.out.println(isPalen(s));;
	}

	private static boolean isPalen(String s) {
		if(s==null || s.length()<1) return false;
		if(s.length()==1) return true;
		if(s.charAt(0)!=s.charAt(s.length()-1)) return false;
		System.out.println(s.substring(1, s.length()-1));
		return isPalen(s.substring(1, s.length()-1));
	}

}
