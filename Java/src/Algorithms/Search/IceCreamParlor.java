package Algorithms.Search;

import java.util.Scanner;

/**
 * Created by Andreas Zinonos on 26/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/icecream-parlor
 */
public class IceCreamParlor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int trips = in.nextInt();
        for (int t=0; t<trips; t++){
            int money = in.nextInt();
            int size = in.nextInt();
            int[] flavours = new int[size];
            for (int i=0; i<size; i++){
                flavours[i] = in.nextInt();
            }

            int flav1 = 0;
            int flav2 = 0;
            // Look through all combinations of flavours
            for (int i=0; i < size-1; i++){
                flav1 = flavours[i];
                for (int j=i+1; j < size; j++){
                    flav2 = flavours[j];
                    if (flav1 + flav2 == money && flav1 != 0 && flav2 != 0)
                        System.out.printf("%d %d\n", Math.min(i+1, j+1), Math.max(i+1, j+1));
                }
            }
        }
    }

}
