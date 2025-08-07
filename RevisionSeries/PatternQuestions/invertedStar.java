package RevisionSeries.PatternQuestions;
import java.util.Scanner;

public class invertedStar {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number to print inverted star: ");
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
