package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 24/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/compare-two-linked-lists
 */
public class CompareLists {

// This is a "method-only" submission.
// You only need to complete this method

    int CompareLists(Node headA, Node headB) {

        while(headA != null && headB != null){
            if (headA.data != headB.data)
                return 0;
            headA = headA.next;
            headB = headB.next;
        }

        // The only way the lists are equal now is if both values are null
        if (headA == null && headB == null)
            return 1;
        else
            return 0;
    }

}
