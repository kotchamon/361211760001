package lab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exBufferReaedr {
    public static void main(String[] args) throws IOException {

        BufferedReader  reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is  your name? : ");
        String name = reader.readLine();
        System.out.println("How own are you? : ");
        int age =Integer.parseInt(reader.readLine());
        System.out.println("How much do you weigh?: ");
        int weigh = Integer.parseInt(reader.readLine());
        //Show data
        System.out.println("Hello,  "+name);
        System.out.println("Your are "+age+"years old.");
        System.out.println(" your are "+weigh);






    }//main









}
