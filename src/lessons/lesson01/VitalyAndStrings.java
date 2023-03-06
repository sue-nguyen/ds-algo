package lessons.lesson01;

import java.util.Scanner;
// LINK: https://codeforces.com/contest/518/problem/A
public class VitalyAndStrings {
    public static String mainMethod(String s) {
        char[] arrS = s.toCharArray();
        for (int i = arrS.length - 1; i >= 0; i--) {
            if (arrS[i] != 'z') {
                arrS[i]++;
                return String.valueOf(arrS);
            }
            arrS[i] = 'a';
        }
        return String.valueOf(arrS);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();
        String result = mainMethod(s);
        if (result.equals(t))
            System.out.println("No such string");
        else
            System.out.println(result);
    }
}
