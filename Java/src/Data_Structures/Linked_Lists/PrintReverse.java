package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse
 */
public class PrintReverse {
// This is a "method-only" submission.
// You only need to complete this method.

    void ReversePrint(Node head) {
        if (head == null)
            return;
        ReversePrint(head.next);
        System.out.printf("%d\n", head.data);
    }

}
