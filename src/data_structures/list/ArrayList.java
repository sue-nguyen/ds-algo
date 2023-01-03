package data_structures.list;

/**
 * An ADT of an ArrayList whose contents are of Double data type.
 */
public class ArrayList implements List {

    /**
     * Capacity of this list.
     */
    private int capacity;

    /**
     * Size of this list.
     */
    private int size;

    /**
     * Main array of this list.
     */
    private Double[] arrayList;

    /**
     * Constructs an empty list with an initial capacity of 10.
     */
    public ArrayList() {
        this.capacity = 10;
        this.size = 0;
        this.arrayList = new Double[this.capacity];
    }

    /**
     * Constructs an empty list with the specified initial capacity.
     * @param capacity the specified initial capacity of this list
     */
    public ArrayList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.arrayList = new Double[capacity];
    }

    /**
     * Returns the capacity of this list.
     * @return the capacity of this list
     */
    public int capacity() {
        return this.capacity;
    }

    /**
     * Returns the size of this list.
     * @return the size of this list
     */
    public int size() {
        return this.size;
    }

    /**
     * Returns true if the list is empty and false otherwise.
     * @return true if the list is empty and false otherwise
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * Returns true if the list is full and false otherwise.
     * @return true if the list is full and false otherwise
     */
    public boolean isFull() {
        return this.size >= this.capacity();
    }

    /**
     * Expands the list to 10 more space in the capacity.
     */
    public void expand() {
        capacity += 10;
        Double[] newList = new Double[capacity()];
        if (size() >= 0) System.arraycopy(arrayList, 0, newList, 0, size());
        arrayList = newList;
    }

    /**
     * Appends the specified element to the end of this list.
     * @param item element to be appended to this list
     */
    public void add(Double item) {
        if (isFull())
            expand();

        arrayList[size()] = item;
        size++;
    }

    /**
     * Inserts the specified element at the specified position of this list.
     * @param index index at which the specified element is to be inserted
     * @param item element to be inserted to this list
     */
    public void add(int index, Double item) {
        if (isFull())
            expand();

        for (int i = size(); i > index; i--)
            arrayList[i] = arrayList[i - 1];

        arrayList[index] = item;
        size++;
    }

    /**
     * Removes the element at the specified position of this list.
     * @param index index of the element to be removed
     */
    public void remove(int index) {
        if (index >= size())
            System.out.println("EXCEPTION WARNING: Index " + index + " is out of bounds. Removal is unsuccessful.\n");
        else {
            System.out.println("SUCCESSFUL TOASTER: Removal is successful at index " + index + ".\n");
            for (int i = index; i < size() - 1; i++)
                arrayList[i] = arrayList[i + 1];
            size--;
        }
        retrieve();
    }

    /**
     * Returns the String representation of the contents of this list.
     * @return the String representation of the contents of this list
     */
    public String print() {
        if (isEmpty())
            return "[ ]";

        else {
            StringBuilder builder = new StringBuilder();
            builder.append("[ ");

            for (int i = 0; i < size(); i++) {
                builder.append(arrayList[i]);
                if (i != size() - 1)
                    builder.append(", ");
            }

            builder.append(" ]");
            return builder.toString();
        }
    }

    /**
     * Prints the contents of this list along with its capacity and size.
     */
    public void retrieve() {
        System.out.println(print());
        System.out.println("List capacity: " + capacity());
        System.out.println("List size: " + size());
        System.out.println();
    }
}