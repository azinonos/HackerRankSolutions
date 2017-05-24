package Algorithms.Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/quicksort2
 */
public class QuickSort2 {

    public static void printArray(int[] arr, int i, int j){
        for (int k=i; k < j; k++)
            System.out.print(arr[k] + " ");
        System.out.println();
    }

    public static int partition(int[] arr, int i, int j){
        int p = arr[i];
        ArrayList<Integer> smaller = new ArrayList<>();
        ArrayList<Integer> bigger = new ArrayList<>();

        for (int k = i + 1; k < j; k++) {
            if (arr[k] < p)
                smaller.add(arr[k]);
            else
                bigger.add(arr[k]);
        }

        // Rebuild array with sorted elements
        for (int k = 0; k < smaller.size(); k++) {
            arr[i + k] = smaller.get(k);
        }

        arr[smaller.size() + i] = p;

        for (int k = 0; k < bigger.size(); k++) {
            arr[i + smaller.size() + 1 + k] = bigger.get(k);
        }

        return i + smaller.size();
    }

    public static void quicksort(int[] arr, int i, int j){
        if (j - i >= 2) {
            int pivot = partition(arr, i, j);
            quicksort(arr, i, pivot);
            quicksort(arr, (pivot + 1), j);
            printArray(arr, i, j);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i=0; i < size; i++)
            arr[i] = in.nextInt();

        quicksort(arr, 0, size);
    }
}
