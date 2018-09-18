package Lab5;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        System.out.println("Input data to Array 2D:");
        //create array
        int[][] num = new int[2][3]; //2 rows and 3 columns = 6 elements

        num = inputData (num);
        showData (num);
    }//main

    private static void showData(int[][] num) {
        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){

            }
            System.out.println();
        }

    }//showData

    private static int[][] inputData(int[][] num) {
        Scanner sc = new Scanner(System.in);

        for (int i=0; i < num.length; i++){
            for ( int j = 0; j < num [i].length; j++){
                System.out.println("enter integers:");
                num[i][j] = sc.nextInt();
            }

        }return num;

    }
}//class