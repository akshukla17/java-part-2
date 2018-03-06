package com.interview.random;
/*
 * need to find max 5 numbers from the given array or file.
 */
public class MaxElements {

	public static void main(String[] args) {

		int []given= {78,45,77,1,44,54,11,36,11,45,100,45,4,5,7,88,7};
		int out[] =new int[5];
		int index=-1;
		for(int i=0;i<out.length;i++) {
			int max=given[i];
			for(int j=i+1;j<given.length;j++) {
				if(max<given[j]) {
					max=given[j];
					index=j;
				}
			}
			out[i]=max;
			given[index]=Integer.MIN_VALUE;
		}
		System.out.println("max 5 number of given array");
		for(int i=0;i<out.length;i++) {
			System.out.print(out[i]+", ");
		}
	}

}
