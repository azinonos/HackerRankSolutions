package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list
 */
public class InsertNodeAtHead {

// This is a "method-only" submission.
// You only need to complete this method.

    Node Insert(Node head,int x) {

        Node node = new Node();
        node.data = x;
        node.next = head;
        return node;

    }

}
