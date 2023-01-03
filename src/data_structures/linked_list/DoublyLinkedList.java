package data_structures.linked_list;

/**
 * A class representing a doubly linked list.
 * @param <T> The type of the data stored in the node of the linked list.
 */
public class DoublyLinkedList<T> implements LinkedList<T> {
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
     * Size, or number of nodes, of the linked list.
     */
    private int size;

    /**
     * Head node of the linked list.
     */
    private Node<T> head;

    /**
     * Tail node of the linked list.
     */
    private Node<T> tail;

    /**
     * Constructs an empty linked list.
     */
    public DoublyLinkedList() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    /**
     * Returns the size of the linked list.
     * @return the size of the linked list
     */
    public int size() {
        return this.size;
    }

    /**
     * Adds the Node containing the data to the linked list.
     * @param data data of the node
     */
    public void add(T data) {
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
     * Returns true if the linked list contains the specified node.
     * @param toFind node whose presence in the list is to be tested
     * @return true if the linked list contains the node
     */
    public boolean contains(T toFind) {
        Node<T> trav;
        for (trav = head; trav != null; trav = trav.getNext()) {
            if (trav.getData().equals(toFind))
                return true;
        }
        return false;
    }

    /**
     * Prints the String representation of the linked list.
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
