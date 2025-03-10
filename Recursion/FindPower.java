package Recursion;

public class FindPower {

    public static int power(int n, int x){
        if(x == 0){
            return 1;
        }
        return n * power(n, x-1);
    }

    public static int optimisedPower(int n, int x){

        if(x == 0){
            return 1;
        }

        int halfPower = optimisedPower(n, x/2);
        int finalPower = halfPower * halfPower;

        if(x%2 != 0){
            finalPower = n * finalPower;
        }
        return finalPower;
    }
    public static void main(String[] args) {
        int n = 2;
        int x = 10;

        //System.out.println(power(n, x));
        System.out.println(optimisedPower(n, x));
    }
}
