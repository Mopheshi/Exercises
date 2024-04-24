package classes.list;

/**
 * This class represents a Singly Linked List data structure.
 * A Singly Linked List is a type of list where each node points to the next node in the list.
 * The list maintains a reference to the head (first node) and tail (last node) for efficient operations.
 */
public class SinglyLinkedList {
    private Node head; // The first node in the list
    private Node tail; // The last node in the list

    /**
     * This class represents a Node in the Singly Linked List.
     * Each Node contains data and a reference to the next Node in the list.
     */
    private static class Node {
        private final int data; // The data stored in the node
        private Node next; // The next node in the list

        /**
         * Constructor for the Node class.
         *
         * @param data The data to be stored in the node.
         */
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * This method inserts a new node at the beginning of the list.
     *
     * @param data The data to be stored in the new node.
     */
    private void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    /**
     * This method inserts a new node at the end of the list.
     *
     * @param data The data to be stored in the new node.
     */
    private void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    /**
     * This method deletes a node with the given data from the list.
     *
     * @param data The data of the node to be deleted.
     */
    private void delete(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                return;
            }
            current = current.next;
        }
    }

    /**
     * This method searches for a node with the given data in the list.
     *
     * @param data The data of the node to be searched.
     * @return The node if found, null otherwise.
     */
    private Node search(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * This method prints the data of all nodes in the list from head to tail.
     */
    private void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    /**
     * This method tests the SinglyLinkedList class by performing various operations on a list.
     */
    public void testSinglyLinkedList() {
        System.out.println("Testing SinglyLinkedList:");
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtBeginning(1);
        singlyLinkedList.insertAtEnd(2);
        singlyLinkedList.insertAtEnd(3);
        singlyLinkedList.printList(); // Should print: 1 2 3
        singlyLinkedList.delete(2);
        singlyLinkedList.printList(); // Should print: 1 3
        System.out.println(singlyLinkedList.search(1) != null); // Should print: true
        System.out.println(singlyLinkedList.search(4) != null); // Should print: false
    }
}