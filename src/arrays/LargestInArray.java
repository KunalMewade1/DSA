package arrays;

import java.util.Arrays;

public class LargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[]= {2,1,1,3,0};
		System.out.println("the largset element in the arrys is " + sort(arr1));
		

		int arr2[]= {8,10,5,7,9};
		System.out.println("the largset element in the arrys is " + sort(arr2));


	}

	private static int sort(int[] arr) {
		// TODO Auto-generated method stub
		Arrays.sort(arr);
		return arr[arr.length-1];
	}

}
