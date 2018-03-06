package com.interview.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCountInString {

	public static void main(String[] args) {

		byte a=102;
		byte b=27;
		byte c=(byte) (a+b);
		System.out.println(c);
		String s="ajay kumar shukla";
		//need to print alternative char-- a will print when count is 1 or 3 ...
		printAlterNativeChar(s);
		System.out.println("\n**************");
		//counting the char of given string
		Map<Character, Integer> map = countChar(s);
		
		//iteration
		for(Entry<Character,Integer> e:map.entrySet()) {
			System.out.println(e.getKey()+" --count-- "+e.getValue());
		}
	}

	private static void printAlterNativeChar(String s) {
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<s.length();i++) {
			
			char c=s.charAt(i);
			if(map.containsKey(c)) {
				int count=map.get(c); 
				map.put(c, count+1);
				count=map.get(c);
				System.out.print(count);
				if(count%2!=0) {
					System.out.print(c);
				}
			}else {
				map.put(c, 1);
				System.out.print(c);
			}
			
				
		}
		
	}

	private static Map<Character, Integer> countChar(String a) {
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			if(map.containsKey(c)) {
				map.put(c,map.get(c)+1);
			}else {
				map.put(c, 1);
			}
		}
		return map;
	}

}
