package RevisionSeries.PatternQuestions;

import java.util.Scanner;

public class characterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter number to print character pattern: ");
        int n = sc.nextInt();
        char ch = 'A';

        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

        sc.close();
    }
}
