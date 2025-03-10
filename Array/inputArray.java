import java.util.*;

public class inputArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks[] = new int[50];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy: "+ marks[0]);
        System.out.println("Che: "+ marks[1]);
        System.out.println("Math: "+ marks[2]);

        System.out.println("AFTER UPDATE:-");

        //Update marks
        marks[1] = marks[1] + 1;
        marks[2] = 64;

        System.out.println("Phy: "+ marks[0]);
        System.out.println("Che: "+ marks[1]);
        System.out.println("Math: "+ marks[2]);

        //pERCENTAGE

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;

        System.out.println("Percentage : " + percentage + "%");

        System.out.println("Length of Array: " + marks.length);

        sc.close();

    }
}
