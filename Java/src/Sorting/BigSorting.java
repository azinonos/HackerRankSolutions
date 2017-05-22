package Sorting;
import java.math.BigInteger;
import java.util.*;

/**
 * Created by Andreas Zinonos on 22/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/big-sorting
 */
public class BigSorting {

    // Returns 1 for greater, 0 for equal, -1 for less than
    public static int compare(String arg1, String arg2){
        if (arg1.length() < arg2.length()){
            return -1;
        }
        if (arg1.length() > arg2.length()){
            return 1;
        }
        for (int i=0; i < arg1.length(); i++){
            if ((int) arg1.charAt(i) < (int) arg2.charAt(i))
                return -1;
            if ((int) arg1.charAt(i) > (int) arg2.charAt(i))
                return 1;
        }

        return 0;
    }

    public static int partition(String[] unsorted, int i, int j){
        int p = i;
        for (int k=i; k < j; k++){
            if (compare(unsorted[k], unsorted[j]) == -1){
                String temp = unsorted[k];
                unsorted[k] = unsorted[p];
                unsorted[p] = temp;
                p++;
            }
        }
        String temp = unsorted[j];
        unsorted[j] = unsorted[p];
        unsorted[p] = temp;

        return p;
    }

    public static void quicksort(String[] unsorted, int i, int j){
        if (i < j){
            int p = partition(unsorted, i, j);
            quicksort(unsorted, i, p-1);
            quicksort(unsorted, p+1, j);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        quicksort(unsorted, 0, n-1);

        for (String s : unsorted)
            System.out.println(s);
    }
}
