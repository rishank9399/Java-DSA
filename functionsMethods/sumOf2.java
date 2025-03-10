package functionsMethods;

import java.util.*;

public class sumOf2 {

    public static int sum() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();

        sc.close();

        return (a + b);
    }

    public static void main(String[] args) {
        int ans = sum();

        System.out.println(ans);
    }

}
