package Lab8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int[] number = {10, 20, 30, 40, 50};

        try {
            System.out.println("Enter an integer: ");
            int num = reader.nextInt();
            System.out.println("Integer :  " + num);
            try {
            System.out.println("number[" + num + "] = " + number[num]);
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Exception:  " + ex);
        }
    } catch (InputMismatchException ex) {
        System.out.println("Excepyion:  " + ex);
    }
     System.out.println ("Complete.");


    }//main

}//class
