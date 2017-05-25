package Data_Structures.Linked_Lists;

/**
 * Created by Andreas Zinonos on 24/05/17.
 *
 * Exercise:
 * https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list
 */
public class InsertNodeDoubleLL {

    Node SortedInsert(Node head,int data) {

        Node temp = head;
        Node newNode = new Node();
        newNode.data = data;

        if (head == null)
            return newNode;

        if (data < temp.data){
            newNode.next = temp;
            temp.prev = newNode;
            return newNode;
        } else {
            Node restOfNodes = SortedInsert(temp.next, data);
            temp.next = restOfNodes;
            restOfNodes.prev = temp;
            return head;
        }
    }

}
