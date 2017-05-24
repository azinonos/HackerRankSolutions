package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 24/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists
 */
public class MergeLists {

// This is a "method-only" submission.
// You only need to complete this method

    Node MergeLists(Node headA, Node headB) {

        if (headA == null)
            return headB;
        if (headB == null)
            return headA;

        if (headA.data < headB.data){
            headA.next = MergeLists(headA.next, headB);
            return headA;
        } else {
            headB.next = MergeLists(headA, headB.next);
            return headB;
        }
    }
}
