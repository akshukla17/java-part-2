package com.code;

public class MergeSort {
	
	public static void main(String[] args) {
		int a [] = {12,4,33,21,6111,7,81};
		HeapSort.printArray(a);
		merge(a,0,a.length-1);
		System.out.println("After merge sorting , array will be");
		HeapSort.printArray(a);
	}

	private static void merge(int[] a,int l,int r) {
		if(l<r){
			int m = (l+r)/2;
			merge(a, l,m);
			merge(a,m+1,r);
			mergeUtil(a,l,m,r);
		}
	}

	private static void mergeUtil(int[] a, int l, int m, int r) {
		int n1 = m-l+1;
		int n2 = r-m;
		int []left = new int[n1];
		int right[]= new int [n2];
		for(int i=0;i<n1;i++){
			left[i]= a[i+l];
		}
		for(int j=0;j<n2;j++){
			right[j] = a[j+m+1];
		}
		int i=0,j=0;
		int k =l;
		while(i<n1 && j< n2){
			 if(left[i]<right[j]){
				 a[k] = left[i];
				 i++;
			 }else{
				 a[k] = right[j++];
			 }
			 k++;
		}
		while(i<n1){
			a[k++] = left[i++];
		}
		while(j<n2){
			a[k++] = right[j++];
		}
		
	}

}
