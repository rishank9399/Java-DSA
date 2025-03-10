package Xjava.ConditionalStatements;

import java.util.*;

public class adultchk {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("You are an Adult.");
        }
        else{
            System.out.print("You are not an Adult.");
        }
        sc.close();
    }
}
