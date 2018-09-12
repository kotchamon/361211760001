package Lab5;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner (System.in);
        int[]num =new int [5]; //default =0
        System.out.print("Please, input integers to array.");
        //input
        for ( int i = 0; i< num.length;i++){
            System.out.print("Enter integer"+(i+1)+":");
            num[i] = Scanner.nextInt();

        }
        //output
        //System.out.println("Data in array following:");
        //for (int i = 0; i < num.length; i++) {
        // System.out.print(num[i] + "");
        // }
        //System.out.println();
        //for (int val : num)
        {
            //  System.out.print(val + "");

        }
        showData(num);
    }

    private static void showData(int[] num) {
        for (int val : num) {
            System.out.print(val + "");
        }
    }
}
