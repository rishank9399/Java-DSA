package functionsMethods;

import java.util.Scanner;

public class primeNumber {

    public static boolean isPrime(int n){

        boolean check =  true;
        if(n==2){
            return check;
        }
        else{

            for(int i=2; i<=Math.sqrt(n); i++){
                if(n%i==0){
                    check = false;
                    break;
                }
            }

        }
        return  check;
    }

    public static void primeInRange(int n){

        for(int i=2; i<n; i++){
            
            if(isPrime(i)){
                System.out.println(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        primeInRange(num);

       // System.out.println("Is number prime : " + isPrime(num));
        sc.close();
    }
}
