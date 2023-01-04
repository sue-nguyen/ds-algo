package data_structures.sorting;

import java.util.Arrays;

import static data_structures.sorting.RandomArray.size;

public class MergeSort {

    public static void mergeSort(int[] list) {
        if (list.length > 1) {
            int mid = list.length / 2;

            int[] left = new int[mid];
            System.arraycopy(list, 0, left, 0, mid);
            mergeSort(left);

            int[] right = new int[list.length - mid];
            System.arraycopy(list, mid, right, 0, list.length - mid);
            mergeSort(right);

            merge(left, right, list);
        }
    }

    public static void merge(int[] left, int[] right, int[] res) {
        int leftPointer = 0;
        int rightPointer = 0;
        int resPointer = 0;

        while (leftPointer < left.length && rightPointer < right.length) {
            if (left[leftPointer] < right[rightPointer])
                res[resPointer++] = left[leftPointer++];
            else
                res[resPointer++] = right[rightPointer++];
        }

        while (leftPointer < left.length)
            res[resPointer++] = left[leftPointer++];

        while (rightPointer < right.length)
            res[resPointer++] = right[rightPointer++];
    }

    public static void mergeSortReverse(int[] list) {
        if (list.length > 1) {
            int mid = list.length / 2;

            int[] left = new int[mid];
            System.arraycopy(list, 0, left, 0, mid);
            mergeSortReverse(left);

            int[] right = new int[list.length - mid];
            System.arraycopy(list, mid, right, 0, list.length - mid);
            mergeSortReverse(right);

            mergeReverse(left, right, list);
        }
    }

    public static void mergeReverse(int[] left, int[] right, int[] res) {
        int leftPointer = 0;
        int rightPointer = 0;
        int resPointer = 0;

        while (leftPointer < left.length && rightPointer < right.length) {
            if (left[leftPointer] > right[rightPointer])
                res[resPointer++] = left[leftPointer++];
            else
                res[resPointer++] = right[rightPointer++];
        }

        while (leftPointer < left.length)
            res[resPointer++] = left[leftPointer++];

        while (rightPointer < right.length)
            res[resPointer++] = right[rightPointer++];
    }

    public static void main(String[] args) {
        System.out.println("ASCENDING ORDER");

        // TEST SIZE = 10
        int[] list1 = size(10);
        System.out.println("Size = 10\nBefore sorting: " + Arrays.toString(list1));
        mergeSort(list1);
        System.out.println("After sorting: " + Arrays.toString(list1));

        // TEST SIZE = 100
        int[] list2 = size(100);
        System.out.println("\nSize = 100\nBefore sorting: " + Arrays.toString(list2));
        mergeSort(list2);
        System.out.println("After sorting: " + Arrays.toString(list2));

        // TEST SIZE = 1000
        int[] list3 = size(1000);
        System.out.println("\nSize = 1000\nBefore sorting: " + Arrays.toString(list3));
        mergeSort(list3);
        System.out.println("After sorting: " + Arrays.toString(list3));

        System.out.println("\nDESCENDING ORDER");

        // TEST SIZE = 10
        int[] list4 = size(10);
        System.out.println("\nSize = 10\nBefore sorting: " + Arrays.toString(list4));
        mergeSortReverse(list4);
        System.out.println("After sorting: " + Arrays.toString(list4));

        // TEST SIZE = 100
        int[] list5 = size(100);
        System.out.println("\nSize = 100\nBefore sorting: " + Arrays.toString(list5));
        mergeSortReverse(list5);
        System.out.println("After sorting: " + Arrays.toString(list5));

        // TEST SIZE = 1000
        int[] list6 = size(1000);
        System.out.println("\nSize = 1000\nBefore sorting: " + Arrays.toString(list6));
        mergeSortReverse(list6);
        System.out.println("After sorting: " + Arrays.toString(list6));
    }
}
