package Data_Structures.Linked_Lists;

import java.util.HashSet;

/**
 * Created by Andreas Zinonos on 24/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle
 */
public class CycleDetection {

    boolean hasCycle(Node head) {

        HashSet<Node> visited = new HashSet<>();
        Node temp = head;

        while(temp != null){
            if (visited.contains(temp))
                return true;
            else
                visited.add(temp);
            temp = temp.next;
        }
        return false;
    }

}
