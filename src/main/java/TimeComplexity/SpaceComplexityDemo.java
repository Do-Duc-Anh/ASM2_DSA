/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TimeComplexity;

import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */

public class SpaceComplexityDemo {
    // O(1) - Constant Space
    public static void swapElements(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap: a = " + a + ", b = " + b);
    }
    // O(N) - Linear Space
    public static int[] duplicateArray(int[] array) {
        return Arrays.copyOf(array, array.length); // Duplicates the array
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // O(1) Example
        System.out.println("Enter two numbers to swap:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        swapElements(a, b);

        // O(N) Example
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] duplicatedArray = duplicateArray(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Duplicated Array (O(N)): " + Arrays.toString(duplicatedArray));
        scanner.close();
    }
}
