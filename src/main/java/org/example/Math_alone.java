package org.example;

import java.util.Scanner;

public class Math_alone {

    private int n;

    public static void main(String[] args) {
        while (true)
        {
            Scanner scan = new Scanner(System.in);
            int user_input = scan.nextInt();

//        System.out.println(user_input);
            calculate(user_input);
        }
    }

    public static void calculate(int n) {
        int i = 0;
//         n = 21;

        // End result (n) should be 1
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            i++;
        }
        System.out.println("Iterations: " + i);
    }
}

// Test