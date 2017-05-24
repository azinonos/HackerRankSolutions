package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list
 */
public class PrintElements {
// This is a "method-only" submission.
// You only need to complete this method.

    void Print(Node head) {

        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }

}
