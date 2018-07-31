package lab3;

import java.util.Scanner;

public class calGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int testScore ;
        //do-while
        do {
            System.out.print("ใส่คะแนนเกรด 0-100 : ");
            testScore = input.nextInt();
        }while (testScore<0 || testScore>100);


        if (testScore < 50)
            System.out.println("Your grade F.");
        else if (testScore < 55)
            System.out.println("Your grade D.");
        else if (testScore < 60)
            System.out.println("Your grade D+");
        else if (testScore < 65)
            System.out.println("Your grade C");
        else if (testScore < 70)
            System.out.println("Your grade C+");
        else if (testScore < 75)
            System.out.println("Your grade B");
        else if (testScore < 80)
            System.out.println("Your grade B+");
        else if (testScore < 100)
            System.out.println("Your grade A");
        else
            System.out.println("lnvalid scor.");

        System.out.println("Good bye. ");




    }//main






}//class
