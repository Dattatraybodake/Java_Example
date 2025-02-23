package array_examples;

import java.util.Scanner;

public class Array_Rotate {

    public static void main(String[] args) {
        int pos = 4; // Position to rotate from
        int demo[] = {0, 3, 6, 9, 12, 15, 18, 21, 24, 27}; // Initial array
        int[] rotatedArray = new int[demo.length]; // Array to store rotated result
        int k = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Original Array:");
        for (int element : demo) {
            System.out.print(element + "\t");
        }

        //  Copy elements from 'pos' to end of the array
        for (int i = pos; i < demo.length; i++) {
            rotatedArray[k] = demo[i];
            k++;
        }
        
        // Copy elements from start to 'pos'
        for (int i = 0; i < pos; i++) {
            rotatedArray[k] = demo[i];
            k++;
        }

        System.out.println("\n\nRotated Array:");
        for (int element : rotatedArray) {
            System.out.print(element + "\t");
        }
        sc.close();
    }
}
