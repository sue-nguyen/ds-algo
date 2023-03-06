package lessons.lesson01;

import java.util.Scanner;
import java.util.ArrayList;
// LINK: https://codeforces.com/contest/242/problem/B
public class BigSegment {
    public static int min(ArrayList<Integer> a) {
        int min = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) < min)
                min = a.get(i);
        }
        return min;
    }

    // Helper method to find min
    public static int max(ArrayList<Integer> a) {
        int max = a.get(0);
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) > max)
                max = a.get(i);
        }
        return max;
    }

    // Helper method to find max

    public static void main(String[] args) {

        /* Input Code */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        ArrayList<Integer> L = new ArrayList<>();
        ArrayList<Integer> R = new ArrayList<>();

        for (int i = 0; i < n * 2; i++) {
            if (i % 2 == 0)
                L.add(input.nextInt());
            else
                R.add(input.nextInt());
        }

        /* Output Code */

        int minL = min(L);
        int maxR = max(R);

        int result = 0;
        for (int i = 0; i < n; i++) {
            if (L.get(i) == minL && R.get(i) == maxR)
                result = i + 1;
        }

        System.out.print(result == 0 ? -1 : result);
    }
}
