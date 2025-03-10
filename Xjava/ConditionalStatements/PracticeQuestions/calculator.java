// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
// 	1 : + (Addition) a + b
// 2 : - (Subtraction) a - b
// 3 : * (Multiplication) a * b
// 4 : / (Division) a / b
// 5 : % (Modulo or remainder) a % b
// Calculate the result according to the operation given and display it to the user.


package Xjava.ConditionalStatements.PracticeQuestions;

import java.util.*;

public class calculator {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First number: ");
        float num1 = sc.nextFloat();

        System.out.print("Enter Second number: ");
        float num2 = sc.nextFloat();

        System.out.print("Enter the opreation(+,-,*,/,%): ");
        char opreation = sc.next().charAt(0);

        switch(opreation){
            case '+':
            System.out.println("Answer: " + (num1+num2));
            break;

            case '-':
            System.out.println("Answer: " + (num1-num2));
            break;

            case '*':
            System.out.println("Answer: " + (num1*num2));
            break;

            case '/':
            System.out.println("Answer: " + (num1/num2));
            break;

            case '%':
            System.out.println("Answer: " + (num1%num2));
            break;

            default:
            System.out.println("Unable to identify....");

        }
        sc.close();

    }
}
