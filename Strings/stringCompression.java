package Strings;

import java.util.Scanner;

public class stringCompression {

    public static StringBuilder StringCompress(String str){

        StringBuilder sb = new StringBuilder("");

        Integer count = 0;

        for(int i=0; i<str.length()-1; i++){
            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
            }else{
                sb.append(str.charAt(i));
                sb.append(count);
                count = 0;
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        System.out.println(StringCompress(str));
        
        sc.close();
    }
}
