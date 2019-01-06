package searching;

import java.util.Arrays;

public class BinarySearch {
	public static void main(String args[]) {

		int a[] = {100,200,300,400,500};
		int n= a.length;
		int x=100;
		int result = binarySearch(a,0, n-1, x);
		 if (result == -1) 
	            System.out.println("Element not present"); 
	    else
		System.out.println("Element " + x +" found at index " + result+  " of array " + Arrays.toString(a));
			
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