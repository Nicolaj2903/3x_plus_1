package org.example;

import java.util.Scanner;

public class Recursive {

    public static void main(String[] args) {

        while (true) {
            Scanner scan = new Scanner(System.in);
            int user_input = scan.nextInt();

            System.out.println(recursive(user_input));
        }
    }

    private static int recursive(int n) {

        if (n == 1) {
            return 0;
        } else {
            if (n % 2 > 0) {
                return 1 + recursive(n * 3 + 1);
            } else {
                return 1 + recursive(n / 2);
            }
        }
    }
}
