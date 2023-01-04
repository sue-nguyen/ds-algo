package data_structures.stack_queue;

/**
 * A basic implementation of queue using singly linked list.
 * @param <T> The type of node stored in the queue.
 */
public class Queue<T> {

    /**
     * An inner class to represent the node of the linked list.
     * @param <T> The type of the data stored in the node.
     */
    public static class Node<T> {

        /**
         * Next link of the node.
         */
        private Node<T> next;

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
         * Setter method for the next link of the node
         * @param next next link to be set for the node
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    /**
     * Root node of the queue.
     */
    private Node<T> root;

    /**
     * Size, or number of elements, of the queue.
     */
    private int size;

    /**
     * Constructs an empty queue.
     */
    public Queue() {
        this.root = null;
        this.size = 0;
    }

    /**
     * Returns the size of the queue.
     * @return the size of the queue
     */
    public int size() {
        return this.size;
    }

    /**
     * Adds the specified element to the end of the queue.
     * @param data specified element to be added to the end of the queue
     */
    public void enqueue(T data) {
        Node<T> trav = root;
        if (root == null)
            root = new Node<>(data);
        else {
            while (trav.getNext() != null) {
                trav = trav.getNext();
            }
            trav.setNext(new Node<>(data));
        }
        size++;
    }

    /**
     * Removes the element at the front of the queue.
     */
    public void dequeue() {
        root = root.getNext();
        size--;
    }

    /**
     * Removes the element at the front and returns its value.
     * @return the value of the element at the front
     */
    public T poll() {
        T res = peek();
        dequeue();
        return res;
    }

    /**
     * Returns the value of the element at the front of the queue without removing it.
     * @return the value of the element at the front of the queue without removing it
     */
    public T peek() {
        return root.data;
    }

    /**
     * Returns true if the queue is empty and false otherwise.
     * @return true if the queue is empty and false otherwise
     */
    public boolean isEmpty() {
        return root == null;
    }

    /**
     * Prints the String representation of the queue.
     */
    public void print() {
        if (isEmpty())
            System.out.println("[ ]");
        else {
            System.out.print("[ ");
            Node<T> trav = root;
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
