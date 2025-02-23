package array_examples;
public class Array_SecondHighestNumber {
	
	public static void findsecondHighest(int[] arr)
	{
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > highest) {
				secondHighest = highest;
				highest = num;
			} else if (num > secondHighest && num < highest) {
				secondHighest = num; // Update second highest
			}
		}

		if (secondHighest == Integer.MIN_VALUE) {
			System.out.println("There is no second highest element.");
		} else {
			System.out.println("The second highest number is: " + secondHighest);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {12, 35, 1, 10, 34, 1};

		if (arr.length < 2) {
			System.out.println("Array must have at least two elements.");
			return;
		}
		findsecondHighest(arr);
	}
}
