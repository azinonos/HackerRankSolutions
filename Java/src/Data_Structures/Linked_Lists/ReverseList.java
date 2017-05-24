package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/reverse-a-linked-list
 */
public class ReverseList {
// This is a "method-only" submission.
// You only need to complete this method.

    Node Reverse(Node head) {

        Node current = head;
        Node prev = null, next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
    }

}
