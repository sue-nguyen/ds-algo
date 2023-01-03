package data_structures.linked_list;

/**
 * The interface for basic linked list data structure.
 * @param <T> The type of the data stored in the node of the linked list.
 */
public interface LinkedList<T> {
    /**
     * Returns the size of the linked list.
     * @return the size of the linked list
     */
    int size();

    /**
     * Adds the Node containing the data to the linked list.
     * @param data data of the node
     */
    void add(T data);

    /**
     * Returns true if the linked list contains the specified node.
     * @param toFind node whose presence in the list is to be tested
     * @return true if the linked list contains the node
     */
    boolean contains(T toFind);

    /**
     * Prints the String representation of the linked list.
     */
    void print();
}
