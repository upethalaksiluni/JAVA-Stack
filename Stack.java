public class Stack
{
    private int maxSize;
    private int top;
    private int[] stackArray;

    // Constructor to initialize the stack
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Push operation to add an element to the top of the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value);
    }

    // Pop operation to remove the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop");
            return -1; // Return a sentinel value or throw an exception in real applications
        }
        return stackArray[top--];
    }

    // Peek operation to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek");
            return -1; // Return a sentinel value or throw an exception in real applications
        }
        return stackArray[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    // Method to return the current size of the stack
    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60); // This should print "Stack is full. Cannot push 60"

        System.out.println("Element on top of the stack: " + stack.peek());

        System.out.println("Popped elements:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        stack.pop(); // This should print "Stack is empty. Cannot pop"
    }
}

