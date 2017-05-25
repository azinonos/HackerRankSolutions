package Data_Structures.Linked_Lists;

import java.util.HashSet;

/**
 * Created by Andreas Zinonos on 24/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list
 */
public class DeleteDuplicateNodes {

// This is a "method-only" submission.
// You only need to complete this method.

    Node RemoveDuplicates(Node head) {
        HashSet<Integer> seen = new HashSet<>();

        Node temp = head;
        seen.add(temp.data);
        while (temp.next != null){
            if (seen.contains(temp.next.data)){
                temp.next = temp.next.next;
            }
            else{
                seen.add(temp.next.data);
                temp = temp.next;
            }
        }
        return head;
    }

}
