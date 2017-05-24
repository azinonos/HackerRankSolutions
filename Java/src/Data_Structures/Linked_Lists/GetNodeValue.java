package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 24/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail
 */
public class GetNodeValue {

// This is a "method-only" submission.
// You only need to complete this method.

    int GetNode(Node head,int n) {

        int index = 0;
        Node current = head;
        Node result = head;

        // Start traversing the result node - list after having a distance
        // of n nodes between the result and current node.
        while(current.next != null){
            current = current.next;
            index++;
            if (index > n)
                result = result.next;
        }
        return result.data;

    }

}
