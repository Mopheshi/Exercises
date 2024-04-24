import classes.list.SinglyLinkedList;
import classes.list.DoublyLinkedList;
import classes.stack.Stack;

public class DataStructures {
//Queue:
//a. Implement a queue data structure in Java using an array.
//b. Implement enqueue and dequeue operations for the queue.
//c. Implement a circular queue to efficiently use the underlying array space.
//d. Discuss the trade-offs between array-based and linked list-based implementations of queues.


//Binary Search Tree (BST):
//a. Implement a binary search tree in Java with methods to:
//Insert a node.
//Delete a node with a given value.
//Search for a node with a given value.
//Traverse the tree in-order, pre-order, and post-order.
//b. Write a method to find the minimum and maximum values in a BST.
//c. Discuss the time complexity of each operation in a BST and the conditions under which the tree degenerates into a linked list.


//Hash Table:
//a. Implement a hash table data structure in Java with methods to:
//Insert a key-value pair.
//Retrieve the value associated with a given key.
//Remove a key-value pair.
//b. Implement collision resolution techniques such as chaining or open addressing.
//c. Discuss the factors affecting the choice of hash function and the collision resolution strategy.


    public static void main(String[] args) {
        // Test SinglyLinkedList
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.testSinglyLinkedList();

        // Test DoublyLinkedList
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList();
        doublyLinkedList.testDoublyLinkedList();

        // Test Stack
        Stack stack = new Stack(5);
        stack.testStack();
    }
}
