package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 25/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/reverse-a-doubly-linked-list
 */
public class ReverseDoubleLL {

    Node Reverse(Node head) {

        Node current = head;
        Node newHead = head;

        while (current != null){
            Node prev = current.prev;
            current.prev = current.next;
            current.next = prev;
            newHead = current;
            current = current.prev; // The next node
        }
        return newHead;
    }

}
