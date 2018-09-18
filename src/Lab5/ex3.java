package Lab5;

import java.util.Scanner;

public class ex3 {
    private static final Object ShowData = ;
    public static void main(String[] args) {
        System.out.println("Input data to Array 2D: ");
        //Create array
        int [][] num = new int[2][3]; //2 Rows and 3 columns = 6 elements

       num = inputData (num);
       ShowData (num);
    }//main

    private static void ShowData(int[][] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++);{

                System.out.println(num[i][j]+"  ");
            }
            System.out.println();
        }
    }//ShowData

    private static int inputData(int[][] num) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num [i].length; j++){
                System.out.println("Enter integers:  ");
                num [i] [j] = sc.nextInt();
            }
        }
        return num;
    }

}//class
