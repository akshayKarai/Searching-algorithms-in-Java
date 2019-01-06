package searching;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearchUsingMergeSort {
	
   public static void main(String args[]) {
	   
	   Scanner scan = new Scanner(System.in);
	   System.out.println("Enter size of the array");
	   int n = Integer.parseInt(scan.nextLine());
	   
	   System.out.println("Enter the numbers");
	   int arr[] = new int[n];
	   for(int i=0;i<n;i++) {
		   arr[i] = scan.nextInt();
	   }

	   binarySearchUsingMergeSort m = new binarySearchUsingMergeSort();
	   m.sort(arr,0,n-1);
	   
	   System.out.println("Sorted array "+ Arrays.toString(arr));
	   
	   System.out.println("Enter the element to be searched ");
	   scan.nextLine();
	   int x = Integer.parseInt(scan.nextLine());
	   scan.close();
	   
	   int result = binarySearch(arr,0, n-1, x);
	   if (result == -1) 
           System.out.println("Element not present"); 
	   else
	   System.out.println("Element " + x +" found at index " + result +  " of array " + Arrays.toString(arr));
   }
   
 void merge(int arr[], int l, int m, int r) 
	{  
		int n1 = m - l + 1; 
		int n2 = r - m; 

		int L[] = new int [n1]; 
		int R[] = new int [n2]; 

		for (int i=0; i<n1; ++i) 
			L[i] = arr[l + i]; 
		for (int j=0; j<n2; ++j) 
			R[j] = arr[m + 1+ j]; 

		int i = 0, j = 0; 

		int k = l; 
		while (i < n1 && j < n2) 
		{ 
			if (L[i] <= R[j]) 
			{ 
				arr[k] = L[i]; 
				i++; 
			} 
			else
			{ 
				arr[k] = R[j]; 
				j++; 
			} 
			k++; 
		} 

		while (i < n1) 
		{ 
			arr[k] = L[i]; 
			i++; 
			k++; 
		} 

		while (j < n2) 
		{ 
			arr[k] = R[j]; 
			j++; 
			k++; 
		} 		
	} 

	void sort(int arr[], int l, int r) 
	{ 
		if (l < r) 
		{ 
			int m = (l+r)/2; 

			sort(arr, l, m); 
			sort(arr , m+1, r); 

			merge(arr, l, m, r); 
		} 

	} 
	
	static int binarySearch(int arr[], int left, int right, int y) {
		
		if(right>=left) {
		int mid = left+ (right-left)/2;
		if(arr[mid]==y) {
			return mid;
		}else if(arr[mid]> y) {
			return binarySearch(arr,left,mid-1,y);
		}else {
			return binarySearch(arr,mid+1,right,y);
		}
			
	}else {
			return -1;
		}

	}
	
}
