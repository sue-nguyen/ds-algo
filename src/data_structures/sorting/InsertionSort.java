package data_structures.sorting;

import java.util.Arrays;
import static data_structures.sorting.RandomArray.size;

/**
 * Insertion sort in both ascending and descending orders.
 */
public class InsertionSort {

    /**
     * Insertion sort in the ascending order.
     * @param list list of integers to be sorted in ascending order
     */
    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int curr = list[i];
            int key;
            for (key = i - 1; key >= 0 && list[key] > curr; key--) {
                list[key + 1] = list[key];
            }
            list[key + 1] = curr;
        }
    }

    /**
     * Insertion sort in the descending order.
     * @param list list of integers to be sorted in descending order
     */
    public static void insertionSortReverse(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int curr = list[i];
            int key;
            for (key = i - 1; key >= 0 && list[key] < curr; key--) {
                list[key + 1] = list[key];
            }
            list[key + 1] = curr;
        }
    }

    public static void main(String[] args) {

        System.out.println("ASCENDING ORDER");

        // TEST SIZE = 10
        int[] list1 = size(10);
        System.out.println("Size = 10\nBefore sorting: " + Arrays.toString(list1));
        insertionSort(list1);
        System.out.println("After sorting: " + Arrays.toString(list1));

        // TEST SIZE = 100
        int[] list2 = size(100);
        System.out.println("\nSize = 100\nBefore sorting: " + Arrays.toString(list2));
        insertionSort(list2);
        System.out.println("After sorting: " + Arrays.toString(list2));

        // TEST SIZE = 1000
        int[] list3 = size(1000);
        System.out.println("\nSize = 1000\nBefore sorting: " + Arrays.toString(list3));
        insertionSort(list3);
        System.out.println("After sorting: " + Arrays.toString(list3));

        System.out.println("\nDESCENDING ORDER");

        // TEST SIZE = 10
        int[] list4 = size(10);
        System.out.println("\nSize = 10\nBefore sorting: " + Arrays.toString(list4));
        insertionSortReverse(list4);
        System.out.println("After sorting: " + Arrays.toString(list4));

        // TEST SIZE = 100
        int[] list5 = size(100);
        System.out.println("\nSize = 100\nBefore sorting: " + Arrays.toString(list5));
        insertionSortReverse(list5);
        System.out.println("After sorting: " + Arrays.toString(list5));

        // TEST SIZE = 1000
        int[] list6 = size(1000);
        System.out.println("\nSize = 1000\nBefore sorting: " + Arrays.toString(list6));
        insertionSortReverse(list6);
        System.out.println("After sorting: " + Arrays.toString(list6));
    }
}
