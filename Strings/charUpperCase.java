package Strings;

import java.util.Scanner;

public class charUpperCase {

    public static void UpperCase(String str){

        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        
        for(int i=1; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                sb.append(str.charAt(i));
                i++;
                ch = Character.toUpperCase(str.charAt(i));
                sb.append(ch);
                
            }
            else{
                sb.append(str.charAt(i) );
            }
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();  

        UpperCase(str);
        sc.close();
    }
}