package Quiz;

import java.util.Scanner;

public class Quiz2_2 {
    public static void main(String[] args) {
        int select;
        System.out.println("เลือกการเสียภาษีตามการแยกประเภทสินค้า?");
        System.out.println("1.10%");
        System.out.println("2.15%");
        System.out.println("3.17%");
        System.out.println("4.40%");
        Scanner input = new Scanner(System.in);
        System.out.println("เลือกประเภทสินค้า(1-4): ");
        select = input.nextInt();
        System.out.println("ราคาสินค้า: 5000");
        System.out.println("ราคาสินค้ารวมภาษี: 5500");
        switch (select){
            case 1 : System.out.println("คุณเสียภาษี 10% ของราคาสินค้า"); break;
            case 2 : System.out.println("คุณเสียภาษี 15% ของราคาสินค้า"); break;
            case 3 : System.out.println("คุณเสียภาษี 17% ของราคาสินค้า"); break;
            case 4 : System.out.println("คุณเสียภาษี 40% ของราคาสินค้า"); break;
        }
    }
}
