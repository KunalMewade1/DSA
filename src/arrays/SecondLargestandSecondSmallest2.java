package arrays;

public class SecondLargestandSecondSmallest2 {
    public static void main(String[] args) {
        int[] array = {10, 5, 20, 8, 15};

        int[] results = findSecondSmallestAndLargest(array);

        System.out.println("Second Smallest: " + results[0]);
        System.out.println("Second Largest: " + results[1]);
    }

    // Method to find the second smallest and second largest elements in the array
    public static int[] findSecondSmallestAndLargest(int[] array) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : array) {
            // Update smallest and secondSmallest
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }

            // Update largest and secondLargest
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return new int[]{secondSmallest, secondLargest};
    }
}