package conditionalStatements;

import java.util.*;

public class incomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int income = sc.nextInt();

        if(income<=500000)
        System.out.println("Tax to be paid : " + 0);

        else if(income<=100000 && income >500000)
        System.out.println("Tax to be paid : " + (income * 0.2));

        else 
        System.out.println("Tax ");
        sc.close();
    }
}
