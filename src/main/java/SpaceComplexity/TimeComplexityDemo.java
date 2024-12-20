/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SpaceComplexity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */

public class TimeComplexityDemo {

    // O(1) - Constant Time
    // This method performs a single operation to retrieve the first element.
    // Time complexity: O(1).
    public static int getFirstElement(int[] array) {
        return array[0];
    }
    // O(N) - Linear Time
    // This method iterates through the entire array to calculate the sum.
    // If the array has N elements, the loop executes N times -> O(N).
    public static int findSum(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    // O(log N) - Logarithmic Time
    // Implements binary search, reducing the search range by half on each iteration.
    // For an array of N elements, the maximum steps are log₂(N) -> O(log N).
    public static int binarySearch(int[] array, int target) {
        int low = 0, high = array.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    // O(N^2) - Quadratic Time
    // Uses two nested loops to find duplicates in the array.
    // For an array of N elements, the total iterations are N * N -> O(N²).
    public static List<Integer> findDuplicates(int[] array) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j] && !duplicates.contains(array[i])) {
                    duplicates.add(array[i]);
                }
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the array
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        // O(1)
        System.out.println("First Element (O(1)): " + getFirstElement(array));
        // O(N)
        System.out.println("Sum of Elements (O(N)): " + findSum(array));
        // O(log N) - Binary Search
        System.out.println("Enter a sorted array for binary search:");
        int[] sortedArray = new int[n];
        for (int i = 0; i < n; i++) {
            sortedArray[i] = scanner.nextInt();
        }
        System.out.println("Enter the target for binary search:");
        int target = scanner.nextInt();
        System.out.println("Binary Search Result (O(log N)): " + binarySearch(sortedArray, target));
        // O(N^2)
        System.out.println("Duplicate Elements (O(N^2)): " + findDuplicates(array));
        scanner.close();
    }
}