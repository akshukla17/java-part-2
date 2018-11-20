package com.code;

public class Test2 {
	public static void main(String[] args) {
		String s= "a -b -c-d-e";
		String [] splitSku =s.split("-");
		for(int i=0;i<splitSku.length;i++){
			System.out.print(splitSku[i]+"#");
		}
	}

}
