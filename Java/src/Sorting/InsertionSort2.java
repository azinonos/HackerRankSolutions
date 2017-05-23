package Sorting;

import java.util.Scanner;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/insertionsort2
 */
public class InsertionSort2 {

    public static void insertionSortPart2(int[] ar)
    {
        for(int i = 1; i < ar.length; i++){
            int x =  ar[i];
            int j = i;
            while (0 < j && x < ar[j-1]){
                ar[j] = ar[j-1];
                j--;
            }
            ar[j] = x;
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

}