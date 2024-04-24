package classes.stack;

/**
 * This class represents a Stack data structure implemented using an array.
 */
public class Stack {
    private final int[] stack; // An array to store the elements of the stack.
    private int top; // An integer to keep track of the top element of the stack.

    /**
     * Constructor for the Stack class.
     *
     * @param capacity The maximum number of elements that the stack can hold.
     */
    public Stack(int capacity) {
        stack = new int[capacity];
        top = -1; // Initially, the stack is empty, so the top is -1.
    }

    /**
     * This method pushes a new element onto the stack.
     *
     * @param value The value to be pushed onto the stack.
     */
    public void push(int value) {
        if (top == stack.length - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stack[++top] = value;
            System.out.println("Pushed " + value + " to the stack.");
        }
    }

    /**
     * This method pops the top element from the stack.
     *
     * @return The value of the popped element, or -1 if the stack is empty.
     */
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int value = stack[top--];
            System.out.println("Popped " + value + " from the stack.");
            return value;
        }
    }

    /**
     * This method checks if a given string of parentheses is balanced.
     *
     * @param input The string of parentheses to be checked.
     * @return true if the string is balanced, false otherwise.
     */
    public boolean isBalanced(String input) {
        Stack stack = new Stack(input.length());
        for (char c : input.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = (char) stack.pop();
                if ((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    /**
     * This method checks if the stack is empty.
     *
     * @return true if the stack is empty, false otherwise.
     */
    private boolean isEmpty() {
        return top == -1;
    }

    /**
     * This method tests the Stack class by performing various operations on a stack.
     */
    public void testStack() {
        Stack stack = new Stack(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isBalanced("(){}[]")); // true
        System.out.println(stack.isBalanced("({[]})")); // true
        System.out.println(stack.isBalanced("({[}])")); // false
    }
}