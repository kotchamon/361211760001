package lab3;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score;
        System.out.println("กรุณากรอกคะแนนของคุณ");
        score = scanner.nextInt();
        //test condition
        if (score<50)System.out.println("Your grade is F.");
        else if (score<55)System.out.println("Your grade is D");
        else  if (score <60)System.out.println("Your grade is D+.");
        else if (score<65)System.out.println("Your grade C");
       else if (score<70)System.out.println("Your grade is C+.");
       else if (score<75)System.out.println("Your grade is B");
       else if (score<79)System.out.println("Your grade is B+.");
       else if (score<=100)System.out.println("Your grade is A.");
       else System.out.println("กรุณากรอกค่าคะแนนให้ถูกต้อง");


    }//main













}
