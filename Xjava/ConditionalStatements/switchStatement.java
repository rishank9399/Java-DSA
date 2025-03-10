package Xjava.ConditionalStatements;

import java.util.*;

public class switchStatement {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int Button = sc.nextInt();

        switch(Button){
            case 1:
            System.out.println("Hiii");
            break;

            case 2:
            System.out.println("Hello");
            break;

            case 3:
            System.out.println("Yupps");
            break;

            default:
            System.out.println("Invalid");
        }
        sc.close();
    }
}


