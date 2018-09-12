package Lab5;

public class ex1 {
    public static void main(String[] args) {
        int namber  [];
        namber = new int[5]; // have 5 elements indox 0-4
        //default of inteeger array is 0
        System.out.println(namber[0]);
        System.out.println(namber[1]);
        System.out.println(namber[2]);
        System.out.println(namber[3]);
        System.out.println(namber[4]);

        namber [3] = 100;
        namber [1] = namber [3] * 3;
    }
}
