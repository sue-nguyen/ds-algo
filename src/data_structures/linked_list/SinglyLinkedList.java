package data_structures.linked_list;

/**
 * A generic version of a singly linked list.
 * @param <T> the type of data in the nodes
 */
public class SinglyLinkedList<T> {

    /**
     * A generic version for the nodes in this linked list.
     * @param <T> the type of data in the nodes
     */
    private static class Node<T> {

        /**
         * The data of the node.
         */
        private T data;

        /**
         * The next link of the node.
         */
        private Node<T> next;

        /**
         * Constructs a node for the data parameter.
         * @param data data of the node
         */
        public Node(T data) {
            this.data = data;
            this.next = null;
        }

        /**
         * A getter method for the data of the node.
         * @return data of the node
         */
        public T getData() {
            return this.data;
        }

        /**
         * A getter method for the next link of the node.
         * @return next link of the node
         */
        public Node<T> getNext() {
            return this.next;
        }

        /**
         * A setter method for the next link of the node.
         * @param next next link of the node
         */
        public void setNext(Node<T> next) {
            this.next = next;
        }
    }

    /**
     * The size or number of nodes in this linked list.
     */
    private int size;

    /**
     * The root node of this linked list.
     */
    private Node<T> root;

    /**
     * Constructs an initial empty linked list with a null root node.
     */
    public SinglyLinkedList() {
        this.root = null;
        this.size = 0;
    }

    /**
     * Returns true if this linked list is empty and false otherwise.
     * @return true if this linked list is empty and false otherwise
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Adds a new node to the end of this linked list.
     * @param data data of the node
     */
    public void add(T data) {
        if (root == null) {
            root = new Node<T>(data);
        }

        else {
            Node<T> trav = root;
            while (trav != null) {
                if (trav.getNext() == null) {
                    trav.setNext(new Node<T>(data));
                    size++;
                }
                trav = trav.getNext();
            }
        }
    }

    /**
     * Prints the String representation of this linked list.
     */
    public void print() {
        Node<T> tmp = root;
        StringBuilder builder = new StringBuilder();
        builder.append("[ ");

        while (tmp != null) {
            builder.append(tmp);
            if (tmp.getNext() != null)
                builder.append(", ");
            tmp = tmp.getNext();
        }

        builder.append(" ]");
        System.out.println(builder.toString());
    }
}
