package array_examples;
import java.util.Scanner;

public class Array_Sum_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        int sum = 0;
        
        // Accept the array from the user.
		System.out.println("Accept The Array Elements from User:");
        for(int i = 0; i < a.length; i++) {
            a[i] = scanner.nextInt();
        }
        
        System.out.println("\nThe Ascending Order Sorting Array Elements are: ");
        // Sort the array elements in ascending order
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
        
        System.out.println("\nThe Descending Order Sorting Array Elements are: ");
        // Sort the array elements in descending order
        for(int i = 0; i < a.length; i++) {
            for(int j = i + 1; j < a.length; j++) {
                if(a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.println(a[i]);
        }
        
        // Calculate the sum of the elements
        for(int i = 0; i < a.length; i++) 
        {
            sum += a[i];
        }
        System.out.println("\nThe sum of the elements is: " + sum);
    }
}
