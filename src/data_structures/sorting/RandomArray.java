package data_structures.sorting;

/**
 * A class to generate a random array of integers with the specified size.
 */
public class RandomArray {

    /**
     * Returns a random array of integers with the specified size.
     * @param n size of the array to be generated
     * @return a random array of integers with the specified size
     */
    public static int[] size(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = (int)(Math.random() * 100);
        return res;
    }
}
