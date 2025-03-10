package Xjava.InputOutput.PractiseQuestions;

import java.util.*;

public class GSTbill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the price of Pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter the price of Pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the price of Eraser: ");
        float eraser = sc.nextFloat();

        float sum = pen + pencil + eraser;
        float gst = (sum/100) * 18;

        System.out.println();
        System.out.println();
        //int $ = 24;

        System.out.println("Pen = " + pen);
        System.out.println("Pencil = " + pencil);
        System.out.println("Eraser = " + eraser);

        System.out.println("Grand total(with GST): " + (sum+gst));

        sc.close();
    }
}
