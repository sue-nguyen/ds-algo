package data_structures.stack_queue;

/**
 * A basic stack implemented using doubly linked list.
 * @param <T> The type of data store in stack.
 */
public class Stack<T> {

    /**
     * Inner class to store the node of the stacks.
     * @param <T> The type of data store in the nodes of stack.
     */
    public static class Node<T> {
        /**
         * Next link of the node.
         */
        private Node<T> next;

        /**
         * Previous link of the node.
         */
        private Node<T> prev;

        /**
         * Data of the node.
         */
        private final T data;

        /**
         * Constructs a node with the given data.
         * @param data data of the node
         */
        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }

        /**
         * Getter method for the data of the node.
         * @return data of the node
         */
        public T getData() {
            return this.data;
        }

        /**
         * Getter method for the next link of the node.
         * @return next link of the node
         */
        public Node<T> getNext() {
            return this.next;
        }

        /**
         * Getter method for the previous link of the node.
         * @return previous link of the node
         */
        public Node<T> getPrev() {
            return prev;
        }

        /**
         * Setter method for the next link of the node.
         * @param n next link to be set for the node
         */
        public void setNext(Node<T> n) {
            this.next = n;
        }

        /**
         * Setter method for the previous link of the node.
         * @param n previous link to be set for the node
         */
        public void setPrev(Node<T> n) {
            this.prev = n;
        }
    }

    /**
     * Head of the stack.
     */
    private Node<T> head;

    /**
     * Tail of the stack.
     */
    private Node<T> tail;

    /**
     * Size, or number of elements, in the stack.
     */
    private int size;

    /**
     * Constructs an empty stack.
     */
    public Stack() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    /**
     * Returns the size of the stack.
     * @return the size of the stack
     */
    public int size() {
        return this.size;
    }

    /**
     * Pushes the specified element to the end of the stack.
     * @param data element to be pushed to the end of the stack
     */
    public void push(T data) {
        Node<T> trav = new Node<>(data);
        if (head == null) {
            head = trav;
            tail = head;
        }
        else {
            trav.setPrev(tail);
            tail.setNext(trav);
            tail = trav;
        }
        size++;
    }

    /**
     * Returns the topmost element of the stack.
     * @return the topmost element of the stack
     */
    public T peek() {
        if (tail != null)
            return tail.data;
        return null;
    }

    /**
     * Returns the topmost element and removes it from the stack.
     * @return the topmost element of the stack
     */
    public T pop() {
        T res = peek();
        if (size() == 0)
            return null;
        else {
            if (size() == 1)
                head = null;
            else {
                tail = tail.getPrev();
                tail.setNext(null);
            }
            size--;
        }
        return res;
    }

    /**
     * Returns true if the stack has no element and false otherwise.
     * @return true if the stack has no element and false otherwise
     */
    public boolean isEmpty() {
        return head == null;
    }

    /**
     * Prints the String representation of the stack.
     */
    public void print() {
        if (size() == 0)
            System.out.println("[ ]");
        else {
            System.out.print("[ ");
            Node<T> trav = head;
            while (trav != null) {
                System.out.print(trav.getData());
                if (trav.getNext() != null)
                    System.out.print(", ");
                trav = trav.getNext();
            }
            System.out.println(" ]");
        }
    }
}
