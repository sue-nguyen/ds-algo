package lessons.lesson01;

import java.util.Scanner;
//LINK: https://codeforces.com/contest/691/problem/A
public class FashionInBerland {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] list = new int[n];

        for (int i = 0; i < n; i++)
            list[i] = input.nextInt();

        int count = 0;
        for (int i : list)
            if (i == 0)
                count++;

        if (n == 1)
            System.out.println(count == 0 ? "YES" : "NO");

        else
            System.out.println(count == 1 ? "YES" : "NO");
    }
}
