// In a program, input 3 numbers: A, B and C.You have to output the average ofthese 3 numbers.(Hint : Average of N numbers is sum of those numbers divided by N

package typeCasting.practiceQuestions;

import java.util.*;

public class avgOf3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        float a = sc.nextInt();
        System.out.println("Enter Second number: ");
        float b = sc.nextInt();
        System.out.println("Enter Third number: ");
        float c = sc.nextInt();

        float avg = (a+b+c)/3;
        System.out.println("Average = "+ avg);

        sc.close();

    }
}
