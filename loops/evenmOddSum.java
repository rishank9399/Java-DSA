package loops;

import java.util.Scanner;

public class evenmOddSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;
        int oddSum = 0;

        System.out.print("Enter First number: ");
        int n = sc.nextInt();
        
        
        System.out.print("Enter Second number: ");
        int m = sc.nextInt();

        for(int i = n; i<=m; i++){
            if(i % 2 == 0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }
        System.out.println();

        System.out.println("Sum of the Even numbers at given Range : " + evenSum);
        System.out.println("Sum of the Odd numbers at given Range : " + oddSum);

        sc.close();
    }
}
