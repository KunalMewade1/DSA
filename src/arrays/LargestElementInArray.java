package arrays;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[]= {2,1,1,3,0};
		System.out.println("the largset element in the arrys is " + findLargest(arr1));
		

		int arr2[]= {8,10,5,7,9};
		System.out.println("the largset element in the arrys is " + findLargest(arr2));


	}

	private static int findLargest(int[] arr) {
		// TODO Auto-generated method stub
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}

}
