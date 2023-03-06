package lessons.lesson01;

import java.util.Scanner;
import java.util.ArrayList;
// LINK: https://codeforces.com/contest/721/problem/B
public class Passwords {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        /* Input Code */

        int n = input.nextInt(); // n number of passwords
        int k = input.nextInt();
        // k number of failed tries to be blocked by site for 5 seconds

        ArrayList<String>  passwords = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String password = input.next();
            passwords.add(password);
        }

        String correct = input.next();

        /* Output Code */

        int countSmall = 0;
        int countEqual = 0;
        for (int i = 0; i < n; i++) {
            if (passwords.get(i).length() < correct.length())
                countSmall++;
            else if (passwords.get(i).length() == correct.length())
                countEqual++;
        }

        int countSame = 0;
        for (int i = 0; i < n; i++) {
            if (passwords.get(i).equals(correct))
                countSame++;
        }

        if (countSame != 0)
            countEqual = countEqual - countSame + 1;
        int total = countSmall + countEqual;

        if (countSmall == 0) {
            if (k >= n)
                System.out.println(1 + " " + total);
            if (k < n)
                System.out.println(1 + " " + ((((total - 1) / k) * 5) + total));
        }

        else {
            if (k >= n)
                System.out.println((countSmall + 1) + " " + total);
            else {
                System.out.print(((((countSmall) / k) * 5) + countSmall + 1) + " ");
                System.out.println(((((total - 1) / k) * 5) + total));
            }
        }
    }
}
