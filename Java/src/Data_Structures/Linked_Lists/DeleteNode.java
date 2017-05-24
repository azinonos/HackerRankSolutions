package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 23/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list
 */
public class DeleteNode {

// This is a "method-only" submission.
// You only need to complete this method.

    Node Delete(Node head, int position) {
        // Complete this method

        if (position == 0){
            head = head.next;
            return head;
        } else {
            Node temp = head;
            for (int i=0; i<position-1; i++)
                temp = temp.next;
            temp.next = temp.next.next;
            return head;
        }

    }

}
