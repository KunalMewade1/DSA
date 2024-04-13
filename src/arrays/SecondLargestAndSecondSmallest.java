package arrays;

import java.util.Arrays;

public class SecondLargestAndSecondSmallest {

	private static void getElements(int[]arr,int n) {
		if(n==0||n==1) {
			System.out.print(-1);
			System.out.print(" ");
			System.out.print(-1);
			System.out.print("\n");
		}
		Arrays.sort(arr);
		int secondsmallest=arr[1];
		int secondLargest=arr[n-2];
		
		System.out.println("Second smallest"+ secondsmallest);
		System.out.println("Second smallest"+ secondLargest);
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,2,4,6,7,5};
		int n=arr.length;
		getElements(arr, n);
     
	}

}
