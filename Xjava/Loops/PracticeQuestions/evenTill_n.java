//Print all even numbers till n.


package Xjava.Loops.PracticeQuestions;

import java.util.*;

public class evenTill_n {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
