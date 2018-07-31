package lab3;

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        int select;
        System.out.println("เลือกรายวิชาที่คุณชอบมากที่สุด?");
        System.out.println("1.Accounting");
        System.out.println("2.Marketing");
        System.out.println("3.System Analysis");
        System.out.println("4.Compute Programming");

        Scanner input = new Scanner(System.in);

        System.out.println("เลือกหมายเลข (1-4):  ");
        select = input.nextInt();
        //switch-case
        switch (select){
            case 1: System.out.println("คุฯชอบ Accounting");break;
            case 2: System.out.println("คุฯชอบ Marketing");break;
            case 3: System.out.println("คุฯชอบ System Analysis");break;
            case 4: System.out.println("คุฯชอบ Computer Programming");break;
            default: System.out.println("กรุณาเลือกหมายลข 1-4 เท่านั้น");

        }




    }  //main

}
