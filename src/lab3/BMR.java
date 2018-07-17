package lab3;

import java.util.Scanner;

public class BMR {
    public static void main(String[] args) {
        String c;
        int h,a;
        double w;
        Scanner scanner = new Scanner(System.in);
        //input data
        System.out.println("กรุณาระบุเพศถ้าเป็นชายพิมพ์ M ถ้าเป็นหญิงพิมพ์ F: ");
        c = scanner.nextLine();
        System.out.println("ระบุน้ำหนักของคุณ:  ");
        w = scanner.nextDouble();
        System.out.println("ระบุความสูงของคุณ: ");
        h = scanner.nextInt();
        System.out.println("คุณอายุเท่าไร:  ");
        a = scanner.nextInt();
        double BMR;
        if (c.equals("M")){
            BMR = 66 + (13.7 * w) + (5 * h) - (6.8 * a);

        }else {
            BMR = 655 +(9.6 * w) + (1.8 * h) - (4.7 * a);
        }
        //output
        System.out.println("Your BMR is :   "+BMR);






    }//main





}
