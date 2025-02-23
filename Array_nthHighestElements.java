package array_examples;
import java.util.Random;

public class Array_nthHighestElements {
    public static void main(String[] args) {
        int[] arr = { 12 , 15, 16, 18, 19, 35, 49 };
        int n = 3; 

        int nthHighest = findNthHighest(arr, n);

        if (nthHighest != Integer.MIN_VALUE) {
            System.out.println("The " + n + "th highest number in the array is: " + nthHighest);
        } else {
            System.out.println("Array does not have a valid " + n + "th highest number.");
        }
    }

    public static int findNthHighest(int[] arr, int n) {
        // Check if n is valid
        if (n < 1 || n > arr.length) {
            System.out.println("Invalid value of n. Please provide a valid position.");
            return Integer.MIN_VALUE;
        }
        return quickSelect(arr, 0, arr.length - 1, n);
    }

    private static int quickSelect(int[] arr, int left, int right, int n) {
        if (left == right) {
            return arr[left]; // Only one element in the segment
        }

        Random rand = new Random();
        int pivotIndex = rand.nextInt(right - left + 1) + left;

        // Partition around the pivot and get its final position
        int pivotFinalIndex = partition(arr, left, right, pivotIndex);

        // Calculate the position of the nth largest element
        int nthLargestPosition = arr.length - n;

        // Check the position of the pivot
        if (pivotFinalIndex == nthLargestPosition) {
            return arr[pivotFinalIndex];
        } else if (pivotFinalIndex < nthLargestPosition) {
            // Recurse on the right side
            return quickSelect(arr, pivotFinalIndex + 1, right, n);
        } else {
            // Recurse on the left side
            return quickSelect(arr, left, pivotFinalIndex - 1, n);
        }
    }

    // method to partition the array around a pivot
    private static int partition(int[] arr, int left, int right, int pivotIndex) {
        int pivotValue = arr[pivotIndex];

        // Move pivot to end
        swap(arr, pivotIndex, right);

        int storeIndex = left;
        for (int i = left; i < right; i++) {
            if (arr[i] < pivotValue) {
                swap(arr, storeIndex, i);
                storeIndex++;
            }
        }

        // Move pivot to its final place
        swap(arr, storeIndex, right);

        return storeIndex;
    }

    // Helper method to swap elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
