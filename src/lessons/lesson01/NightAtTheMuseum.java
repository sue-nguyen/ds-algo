package lessons.lesson01;

import java.util.Scanner;
//LINK: https://codeforces.com/contest/731/problem/A
public class NightAtTheMuseum {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        if (s.charAt(0) != 'a')
            s = 'a' + s;
        int countRot = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int dif = Math.abs(s.charAt(i + 1) - s.charAt(i));
            if (dif < 13)
                countRot += dif;
            else
                countRot += (26 - dif);
        }
        System.out.println(countRot);
    }
}
