package Xjava.PatternQuestions;

import java.util.*;

public class triangle0_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            for(int j = 1;j <= i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
