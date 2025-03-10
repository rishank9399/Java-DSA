package Strings;

import java.util.Scanner;

public class compareString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Strings are equal.");
        }else{
            System.out.println("Strings are not equal.");
        }
        sc.close();
    }
}
