// // // Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
// // // If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
// // // If they enter 0 then stop.
// // // If he/ she scores :
// // // Marks >=90 -> print “This is Good”
// // // 89 >= Marks >= 60 -> print “This is also Good”
// // // 59 >= Marks >= 0 -> print “This is Good as well”
// // // 	Because marks don’t matter but our effort does.
// // // (Hint : use do-while loop but think & understand why)

package Xjava.Loops.PracticeQuestions;

// // import java.util.*;

// // public class inputMarks {
// //     public static void main(String args[]) {

// //         Scanner sc = new Scanner(System.in);
// //         int i = 1;
// //         int total = 0;
// //         float percent = 0;
// //         int counter = 0;

// //         while (true) {
// //             if (i == 0) {

// //                 percent = total / counter;
// //                 if (percent >= 90) {
// //                     System.out.println(percent + "\nThis is Good");
// //                 } else if (percent <= 89 || percent >= 60) {
// //                     System.out.println(percent + "\nThis is also Good");
// //                 } else {
// //                     System.out.println(percent + "\nThis is Good as well");
// //                 }
// //                 break;

// //             }

// //             do {

// //                 System.out.print("Enter marks: ");
// //                 float marks = sc.nextFloat();
// //                 total += marks;
// //                 counter++;

// //                 System.out.print("Enter 1 to continue or 0 to stop: ");
// //                 int j = sc.nextInt();

// //                 if (j == 0) {
// //                     i = 0;
// //                     break;
// //                 }

// //             } while (i == 1);
// //         }
// //         sc.close();

// //     }
// // }

// import java.util.*;


// public class inputMarks {
//    public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in);
//        int input;


//        do {
//            int marks = sc.nextInt();
//            if(marks >= 90 && marks <= 100) {
//                System.out.println("This is Good");
//            } else if(marks >= 60 && marks <= 89) {
//                System.out.println("This is also Good");
//            } else if(marks >= 0 && marks <= 59) {
//                System.out.println("This is Good as well");
//            } else {
//                System.out.println("Invalid");
//            }

 
//            System.out.println("Want to continue ? (yes(1) or no(0))");
//            input = sc.nextInt();
      
//        } while(input == 1);
//        sc.close();
//    }   
// }
import java.util.*;

public class inputMarks{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;

        do{
            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();

            if(marks >= 90){
                System.out.println("Marks: "+marks+"\nThis is good.");
            }
            else if(marks<=89 && marks>=60){
                System.out.println("Marks: "+marks+"\nThis is also good.");
            }
            else{
                System.out.println("Marks: "+marks+"\nThis is good too.");
            }

            System.out.println("Want to continue ? (yes(1) or no(0))");
            n = sc.nextInt();


        }while(n==1);
        sc.close();
    }
}