package Xjava.ConditionalStatements;

import java.util.*;

public class compare2num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter Second number: ");
        float num2 = sc.nextFloat();

        if(num1==num2){
            System.out.println("Both numbers are Equal");
        }
        else if(num1>num2){
            System.out.println(num1 + " is greater than " + num2);
        }
        else{
            System.out.println(num2 + " is greater than " + num1);
        }

        sc.close();

    }
}
