package data_structures.list;

/**
 * The interface for basic list data structures.
 */
public interface List {
    /**
     * Returns the capacity of this list.
     * @return the capacity of this list
     */
    int capacity();

    /**
     * Returns the size of this list.
     * @return the size of this list
     */
    int size();

    /**
     * Returns true if the list is empty and false otherwise.
     * @return true if the list is empty and false otherwise
     */
    boolean isEmpty();

    /**
     * Returns true if the list is full and false otherwise.
     * @return true if the list is full and false otherwise
     */
    boolean isFull();

    /**
     * Expands the list to 10 more space in the capacity.
     */
    void expand();

    /**
     * Appends the specified element to the end of this list.
     * @param item element to be appended to this list
     */
    void add(Double item);

    /**
     * Inserts the specified element at the specified position of this list.
     * @param index index at which the specified element is to be inserted
     * @param item element to be inserted to this list
     */
    void add(int index, Double item);

    /**
     * Removes the element at the specified position of this list.
     * @param index index of the element to be removed
     */
    void remove(int index);

    /**
     * Returns the String representation of the contents of this list.
     * @return the String representation of the contents of this list
     */
    String print();

    /**
     * Prints the contents of this list along with its capacity and size.
     */
    void retrieve();
}
