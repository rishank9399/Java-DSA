package Recursion;

import java.util.Scanner;

public class RecursionConcepts {

    public static int calculate_sum(int n){
        if(n == 1){
            return 1;
        }
        else{
            return (n + calculate_sum(n-1));
        }
    }

    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        else{
            return (fibonacci(n-1) + fibonacci(n-2));
        }
    }

    public static boolean isSorted(int arr[], int i){
        if(i == arr.length-1){
            return true;
        }
        if(arr[i] > arr[i+1]){
            return false;
        }else{
            return isSorted(arr, i+1);
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int arr[] = {1,2,3,4,5};
        sc.close();

        //System.out.println(calculate_sum(n));
        //System.out.println(fibonacci(n));
        System.out.println(isSorted(arr, n)); 
    }
}
