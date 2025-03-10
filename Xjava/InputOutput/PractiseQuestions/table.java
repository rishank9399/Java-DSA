//Make a program that prints the table of a number that is input by the user. 
//(HINT - You will have to write 10 lines for this but as we proceed in the course you will be studying about ‘LOOPS’ that will simplify your work A LOT!)


package Xjava.InputOutput.PractiseQuestions;

import java.util.*;

public class table {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        System.out.println(num + " x  1 = " + num*1);
        System.out.println(num + " x  2 = " + num*2);
        System.out.println(num + " x  3 = " + num*3);
        System.out.println(num + " x  4 = " + num*4);
        System.out.println(num + " x  5 = " + num*5);
        System.out.println(num + " x  6 = " + num*6);
        System.out.println(num + " x  7 = " + num*7);
        System.out.println(num + " x  8 = " + num*8);
        System.out.println(num + " x  9 = " + num*9);
        System.out.println(num + " x 10 = " + num*10);

        sc.close();

    }
}
