package com.code;

public class RQSort {
	public static void main(String[] args) {
		int []a = {1,2,1,2,2,0,0,1,2};
		Print.printArray(a);
		//sort(a,0,a.length-1);
		Print.printArray(a);
		int pivot =-1;
		for(int i=0;i<a.length;i++)
			if(a[i] ==1) pivot =i;
		
		sortQ(a,0,a.length-1,pivot);
		System.out.println("after sorting");
		Print.printArray(a);
	}
	private static void sortQ(int a[], int low, int high, int pivot){
		if(low<high){
			int part = pp(a,low, high,pivot);
			sortQ(a,low, part-1,pivot);
			sortQ(a, part+1, high,pivot);
		}
	}
	private static int pp(int a[],int low, int high, int p){
		int pivot =a[p];
		int i=low-1, j =low;
		for(;j<high;j++){
				if(a[j]<pivot){
					i++;
					swap(a, i,j);
				}
		}
		swap(a, i+1,p);
		return (i+1);
	}
	private static void sort(int []a, int low, int high){
		if(low < high){
			int p = (high-low+1)/2;
			swap(a,p,high);
			int part = partition(a,low, high);
			sort(a,low,part-1);
			sort(a,part+1,high);
		}
	}
	private static int partition(int []a,int low, int high){
		int pivot =a[high];
		int i=low-1;
		int j=low;
		for(;j<high;j++){
			 if(a[j]<pivot){
				 i++;
				 swap(a,j,i);
			 }
		}
		swap(a,i+1,high);
		return (i+1);
	}
	private static void swap(int a[], int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j]=t;
	}
}
