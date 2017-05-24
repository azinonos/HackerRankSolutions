package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list
 */
public class InsertNodeAtPosition {
// This is a "method-only" submission.
// You only need to complete this method.

    Node InsertNth(Node head, int data, int position) {

        Node temp = head;
        Node node = new Node();

        if (position == 0){
            node.data = data;
            node.next = temp;
            return node;
        } else {

            for (int i=0; i < position - 1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            node.data = data;
            temp.next = node;

            return head;
        }
    }

}
