package data_structures.linked_list;

/**
 * A demo of the singly linked list.
 */
public class SLL_Demo {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.print();
        list.add(3);
        list.add(54);
        list.add(12);
        list.add(26);
        list.add(44);
        list.print();
        System.out.println("List size: " + list.size());
        System.out.println("Does linked list contain 15: " + list.contains(15));
        System.out.println("Does linked list contain 3: " + list.contains(3));
        System.out.println("Does linked list contain 95: " + list.contains(95));
        System.out.println("Does linked list contain 54: " + list.contains(54));
        System.out.println("Does linked list contain 20: " + list.contains(20));
        System.out.println("Does linked list contain 44: " + list.contains(44));
    }
}
