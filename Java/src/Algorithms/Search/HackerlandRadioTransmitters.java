package Algorithms.Search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Andreas Zinonos on 26/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/hackerland-radio-transmitters
 */
public class HackerlandRadioTransmitters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int range = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }

        // Sort the array of houses
        Arrays.sort(x);

        int i = 0;
        int noOfTransmitters = 0;
        while(i < n){
            int coveredRange = x[i] + range;
            // Keep moving the index while it's less than the no of houses
            // and the house is inside the covered range
            while(i < n && x[i] <= coveredRange) i++;
            coveredRange = x[--i] + range;
            while(i < n && x[i] <= coveredRange) i++;
            noOfTransmitters++;
        }
        System.out.println(noOfTransmitters);
    }
}
