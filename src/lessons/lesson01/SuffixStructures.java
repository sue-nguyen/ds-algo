package lessons.lesson01;

import java.util.Scanner;
// LINK: https://codeforces.com/contest/448/problem/B
public class SuffixStructures {
    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        String t = input.next();

        boolean automaton = false, array = false, needTree = false;

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alphabet.length(); i++) {
            int sCountChar = countChar(s, alphabet.charAt(i));
            int tCountChar = countChar(t, alphabet.charAt(i));
            if (sCountChar < tCountChar)
                needTree = true;
            if (sCountChar > tCountChar)
                automaton = true;
        }

        int match = -1;
        for (int i = 0; i < t.length(); i++) {
            int found = s.indexOf(t.charAt(i), match + 1);
            if (match < found)
                match = found;
            else {
                array = true;
                break;
            }
        }

        if (needTree)
            System.out.println("need tree");

        if (automaton && array && !needTree)
            System.out.println("both");

        if (automaton && !array && !needTree)
            System.out.println("automaton");

        if (!automaton && array && !needTree)
            System.out.println("array");
    }
}
