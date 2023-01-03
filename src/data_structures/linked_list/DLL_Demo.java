package data_structures.linked_list;

/**
 * A demo for the doubly linked list.
 */
public class DLL_Demo {
    public static void main(String[] args) {
        DoublyLinkedList<String> list = new DoublyLinkedList<>();
        list.print();
        list.add("Chicago");
        list.add("Los Angeles");
        list.add("Houston");
        list.add("San Francisco");
        list.add("San Diego");
        list.print();
        System.out.println("List size: " + list.size());
        System.out.println("Does the list contain Cleveland: " + list.contains("Cleveland"));
        System.out.println("Does the list contain San Francisco: " + list.contains("San Francisco"));
        System.out.println("Does the list contain Dallas: " + list.contains("Dallas"));
        System.out.println("Does the list contain New York: " + list.contains("New York"));
        System.out.println("Does the list contain Los Angeles: " + list.contains("Los Angeles"));
        System.out.println("Does the list contain Houston: " + list.contains("Houston"));
    }
}
