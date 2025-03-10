package Recursion;

import java.util.Scanner;

public class printDecNum {

    public static void print_Decreasing_Numbers(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }else{
            System.out.print(n + " ");
            print_Decreasing_Numbers(n-1);
        }
    }

    public static int print_Infinite(int n){
        int ma = Integer.MIN_VALUE;
        int num = print_Infinite(n+1);

        return Math.max(ma,num);
    }

    public static void print_Increasing_Numbers(int n){
        if(n == 1){
            System.out.print(n);
            return;
        }else{     
            print_Increasing_Numbers(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        //print_Decreasing_Numbers(n);
        print_Increasing_Numbers(n);
        sc.close();
    }
}
