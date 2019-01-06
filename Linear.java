package searching;

public class Linear {
	
	public static void main(String[] args) {
	
		int arr[] = {1,5,3,7,4,9};
		int n=arr.length;
		int x=9;
		int result = linearSearch(arr,n,x);
		if (result == -1) 
	           System.out.println("Element not present"); 
		   else
		System.out.println(x+ " is at index " + result);
				
}
	static int linearSearch(int array[], int no, int xy) {
		int r=0;
		for(int i=0;i<no;i++) {
			if(array[i]==xy) {
				r= i;
			}else {
			r= -1;
			}
		}
		return r;
			
	}
}
