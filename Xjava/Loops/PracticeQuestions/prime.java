package Xjava.Loops.PracticeQuestions;

import java.util.*;

public class prime {
    public static void main(String args[]){

        Scanner sc =  new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int flag = 0;

        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=1;
            }   
        }
        if(flag==1){
            System.out.println("Not a Prime number.");
        }
        else{
            System.out.println("prime number");
        }
        sc.close();
    }
}
