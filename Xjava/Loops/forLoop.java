package Xjava.Loops;

public class forLoop {
    public static void main(String args[]){

        // for(int i=11;i<11;i=i+20){
        //     System.out.println("hello world!");
        // }
        // System.out.println("kii");

        for(int i=1;i<=10;i++){
            System.out.print(i+" ");
        }
        
        System.out.println();

        for(int i=1;i<=10;System.out.println(i++));

    }
}
