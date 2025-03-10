package Array_2D;

import java.util.Scanner;

public class maxNumArray {

    public static int maxElement(int matrix[][]){
        int maxNum = Integer.MIN_VALUE;

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                maxNum = Math.max(maxNum, matrix[i][j]);
            }
        }
        return maxNum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of Rows: ");
        int n = sc.nextInt();

        System.out.print("Enter number of Coulmns: ");
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];

        System.out.println("Enter the elements of matrix: ");
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Maximum number in the array is : " + maxElement(matrix));
        sc.close();
    }
}
