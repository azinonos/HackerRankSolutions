package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 24/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists
 */
public class FindMergePoint {

// Complete this function
// Do not write the main method.

    int FindMergeNode(Node headA, Node headB) {

        Node currA = headA;
        Node currB = headB;

        while (currA != currB){
            if (currA.next == null)
                currA = headB;
            else
                currA = currA.next;

            if (currB.next == null)
                currB = headA;
            else
                currB = currB.next;
        }
        return currA.data;
    }

}
