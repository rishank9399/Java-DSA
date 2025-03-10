//Try to declare meaningful variables of each type. Eg - a variable named age should be a numeric type (int or float) not byte.
package Xjava.InputOutput.PractiseQuestions;
import java .util.*;

public class variables {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your Gender(Enter M for male & F for female): ");
        char Gender = sc.next().charAt(0);

        System.out.print("Enter your Weight: ");
        float weight = sc.nextFloat();

        System.out.print("Enter First Character of your name: ");
        char letter = sc.next().charAt(0);

        System.out.println("Your Details are as Follows:- ");

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: "+ Gender);
        System.out.println("Weight: "+ weight);
        System.out.println("First Word: "+ letter);
        
        sc.close();
    }
}
