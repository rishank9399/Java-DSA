package Strings;

import java.util.Scanner;

public class largestString {

    public static void larger(){

        String letters[] = {"mango", "apple", "banana"};

        String largest = letters[0];

        for(int i=1; i<letters.length; i++){
            if(largest.compareToIgnoreCase(letters[i]) < 0){
                largest = letters[i];
            }
        }
        System.out.println(largest);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        larger();

        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String largest = "";

        if(str1.compareToIgnoreCase(str2) < 0){
            largest = str2;
        }
        else if(str1.compareToIgnoreCase(str2) == 0){
            System.out.println("Both are equal.");
        }else{
            largest = str1;
        }

        System.out.println(largest);
        sc.close();
    }
}
