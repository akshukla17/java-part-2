package com.code;

public class HeapSort{
	public static void main(String[] args){
		int a[] ={12, 11, 1, 5, 6, 7,23};
		printArray(a);
		sort(a);
		System.out.println("Print array after sorting ");
		printArray(a);
	}
	public static void sort(int []a){
		int n = a.length;
		for(int i= (n-1)/2 ;i>=0;i--){
			System.out.println(a[i]);
			 heapfy(a,n,i);
		}
		 // One by one extract an element from heap 
        for (int i=n-1; i>=0; i--) 
        { 
            // Move current root to end 
            int temp = a[0]; 
            a[0] = a[i]; 
            a[i] = temp; 
  
            // call max heapfy on the reduced heap 
            heapfy(a, i, 0); 
        } 
	}
	
	public static void heapfy(int []a, int n,int i){
		int largest = i;
		int left = 2*i +1;
		int right = 2 * i +2;
		if(left < n && a[left] > a[largest]){
			largest =left;
		}
		if(right < n && a[right] > a[largest]){
			largest = right;
		}
		if(largest !=i){
			//swap i with largest 
			int s = a[i];
			a[i] = a[largest];
			a[largest] = s;
			heapfy(a, n ,largest);
		}
	}
	
	 /* A utility function to print array of size n */
    public static void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i]+" "); 
        System.out.println(); 
    } 
}