/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P61;

import java.util.Arrays;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class BubbleSort {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] bestCase = new int[1000];
        int[] averageCase = new int[1000];
        int[] worstCase = new int[1000];

        for (int i = 0; i < 1000; i++) {
            bestCase[i] = i + 1; // Already sorted array
            averageCase[i] = new Random().nextInt(1000); // Random array
            worstCase[i] = 1000 - i; // Reverse sorted array
        }

        long start, end;

        // Best Case: Already sorted array
        start = System.nanoTime();
        bubbleSort(bestCase);
        end = System.nanoTime();
        System.out.println("Best Case Time: " + (end - start) + " nanoseconds");

        // Average Case: Random array
        start = System.nanoTime();
        bubbleSort(averageCase);
        end = System.nanoTime();
        System.out.println("Average Case Time: " + (end - start) + " nanoseconds");

        // Worst Case: Reverse sorted array
        start = System.nanoTime();
        bubbleSort(worstCase);
        end = System.nanoTime();
        System.out.println("Worst Case Time: " + (end - start) + " nanoseconds");
    }
}