package array_examples;

// Importing necessary classes
import java.util.Arrays;
import java.util.Scanner;

// Class to find the kth smallest element in an array
class Smallest {
    public int findKthSmallest(int[] array, int k) {
        // Sort the array in ascending order
        Arrays.sort(array);

        // Return the kth element in the sorted array
        return array[k - 1];
    }
}

// Main class
public class Array_Smallest_Elements {
    public static void main(String[] args) {
        // Creating a scanner object for input
        Scanner sc = new Scanner(System.in);

        // Creating an integer array of size 5
        int a[] = new int[5];

        // Accepting values from the user
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        // Accepting the value of k from the user
        System.out.println("Enter the value of k: ");
        int k = sc.nextInt();

        // Creating an instance of the Smallest class
        Smallest sm = new Smallest();

        // Finding the kth smallest element in the array
        int result = sm.findKthSmallest(a, k);

        // Displaying the result
        System.out.println("The " + k + "th smallest element is: " + result);
    }
}

/*
Explanation:

import java.util.Arrays; - This line imports the Arrays class from the java.util package.
This class provides methods for manipulating arrays, including sorting.

import java.util.Scanner; - This line imports the Scanner class from the java.util package. 
Scanner is used for obtaining input from the user.

class Smallest { ... } -This class contains a method findKthSmallest which finds the kth smallest element in an array. 
It sorts the array in ascending order using Arrays.sort() and returns the kth element from the sorted array.

public class SmallestElements { ... } - This is the main class containing the main method.

Scanner sc = new Scanner(System.in); - This line creates a Scanner object sc to take input from the user.

int a[] = new int[5]; - This line declares an integer array a of size 5 to store user input.

for (int i = 0; i < a.length; i++) { ... } - This loop iterates over the array a and 
accepts 5 integer values from the user using sc.nextInt().

System.out.println("Enter the value of k: "); - This line prompts the user to enter the value of k, 
which represents the kth smallest element to find.

int k = sc.nextInt(); - This line accepts the value of k from the user.

Smallest sm = new Smallest(); - This line creates an instance of the Smallest class.

int result = sm.findKthSmallest(a, k); - This line calls the findKthSmallest method of the Smallest class 
to find the kth smallest element in the array a and stores the result in the variable result.

System.out.println("The " + k + "th smallest element is: " + result); - This line prints the result, 
indicating which element is the kth smallest in the array.
*/




