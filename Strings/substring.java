package Strings;

import java.util.Scanner;

public class substring {

    public static void getsubstring(String letter, int si, int ei){
        for(int i=si; i<ei; i++){
            System.out.print(letter.charAt(i));
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String letter = sc.next();

        System.out.print("Enter starting Index if Substring: ");
        int si = sc.nextInt();

        System.out.print("Enter Ending Index of Subsrtring: ");
        int ei = sc.nextInt();

        getsubstring(letter, si, ei);

        System.out.println();

        System.out.println(letter.substring(si,ei));

        sc.close();
    }
}
