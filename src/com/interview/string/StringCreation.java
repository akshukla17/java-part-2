package com.interview.string;

import java.io.IOException;

public class StringCreation {

	public static void main(String[] args) {
		String s="abcaas";
		System.out.println(reverse(s));
/*
		String ss="a";
		String s=new String("a");
		String sss=new String("a");
		System.out.println("new: "+s.hashCode()+", ss: "+ss.hashCode()+", sss: "+sss.hashCode());
		
		System.out.println("gggggg"+(s==sss));
		
		String a="hiasdf";
		System.out.println(a.charAt(a.length()-1)+" "+a.length());
		System.out.println(a.substring(2, 3));*/
		
		try {
			throw new IOException("hello");
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}

	private static String reverse(String s) {
		if(s.length()==1) return s;
		return s.charAt(s.length()-1)+reverse(s.substring(0, s.length()-1));
	}

}
