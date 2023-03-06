package lessons.lesson01;

import java.util.ArrayList;
import java.util.Scanner;
// LINK: https://codeforces.com/contest/572/problem/A
public class Arrays {
    public static void main(String[] args) {
        /* Input Code */
        Scanner input = new Scanner(System.in);
        int nA = input.nextInt(), nB = input.nextInt();
        int k = input.nextInt(), m = input.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 0; i < nA; i++)
            A.add(input.nextInt());

        ArrayList<Integer> B = new ArrayList<>();
        for (int i = 0; i < nB; i++)
            B.add(input.nextInt());

        /* Output Code */

        System.out.print(A.get(k - 1) < B.get(nB - m) ? "YES" : "NO");
    }
}
