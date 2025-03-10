//Make a program that takes the radius of a circle as input, calculates its radius and area and prints it as output to the user.

package Xjava.InputOutput.PractiseQuestions;

import java.util.*;

public class radius {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Entet the radius of the circle: ");
        float radius = sc.nextFloat();

        System.out.println("Area of the circle is: " + 3.14*radius*radius);

        sc.close();

    }
}
