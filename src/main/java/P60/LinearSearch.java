/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P60;

/**
 *
 * @author LENOVO
 */
public class LinearSearch {

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return index if element is found
            }
        }
        return -1; // Return -1 if element is not found
    }

    public static void main(String[] args) {
        int[] arr = new int[10000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1; // Fill array with numbers 1 to 10000
        }

        long start, end;

        // Best Case: Target is the first element
        start = System.nanoTime();
        linearSearch(arr, 1);
        end = System.nanoTime();
        System.out.println("Best Case Time: " + (end - start) + " nanoseconds");

        // Average Case: Target is in the middle
        start = System.nanoTime();
        linearSearch(arr, 5000);
        end = System.nanoTime();
        System.out.println("Average Case Time: " + (end - start) + " nanoseconds");

        // Worst Case: Target is the last element
        start = System.nanoTime();
        linearSearch(arr, 10000);
        end = System.nanoTime();
        System.out.println("Worst Case Time: " + (end - start) + " nanoseconds");
    }
}
