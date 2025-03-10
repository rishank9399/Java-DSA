package typeCasting.practiceQuestions;

import java.util.*;

public class areaOfSq {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Sides of the Square: ");
        float side = sc.nextFloat();

        System.out.println("Area of Square = " + (side * side));
        sc.close();
    }
}
