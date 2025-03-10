package typeCasting;

import java.util.*;

public class typeConversion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float num = sc.nextInt();

        
        int a = 4;
        
        long b = a;
        double d = b;

        System.out.println(d + "  " + num);
        sc.close();
    }
}
