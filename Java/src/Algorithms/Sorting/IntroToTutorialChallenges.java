package Algorithms.Sorting;

import java.util.Scanner;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/tutorial-intro
 */
public class IntroToTutorialChallenges {

    public static int binSearch(int[] arr, int value, int i, int j){
        if(i == j)
            return i;
        int k = (i+j) / 2;
        if (value <= arr[k]){
            return binSearch(arr, value, i, k);
        } else {
            return binSearch(arr, value, k+1, j);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();
        int size = in.nextInt();
        int[] arr = new int[size];
        for (int i=0; i < size; i++){
            arr[i] = in.nextInt();
        }

        int pos = binSearch(arr, value, 0, size);
        System.out.println(pos);

    }

}
