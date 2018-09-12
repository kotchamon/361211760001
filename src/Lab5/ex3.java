package Lab5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
         Scanner  Scanner  = new Scanner(System.in);
        int[] num = new int[5]; //default =0
        System.out.print("Please, input integers to array.");
        //input
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter integer" + (i + 1) + ":");
            num[i] = Scanner.nextInt();

            showData(num);
        }



    }

    private static void showData(int[] num) {
        for (int val : num) {
            System.out.print(val + "");
        }
    }
}
