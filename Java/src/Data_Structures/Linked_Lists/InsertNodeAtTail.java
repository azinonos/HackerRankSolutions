package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list
 */
public class InsertNodeAtTail {

    Node Insert(Node head,int data) {

// This is a "method-only" submission.
// You only need to complete this method.

        Node temp = head;

        while (temp.next != null)
            temp = temp.next;

        temp.next = new Node();
        temp.next.data = data;
        temp.next.next = null;

        return head;

    }

}
