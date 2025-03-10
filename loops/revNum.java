package loops;

public class revNum {
    public static void main(String[] args) {

        int n= 200704;

        while(n>0){
            int lastDigit=n%10;
            System.out.print(lastDigit + " ");
            n=n/10;
        }
    }
}
