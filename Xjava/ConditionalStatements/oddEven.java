package Xjava.ConditionalStatements;

import java.util.*;

public class oddEven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("Given input is Even number.");
        } else {
            System.out.println("Given input is Odd number.");
        }
        sc.close();

    }
}
