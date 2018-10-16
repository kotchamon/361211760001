package Lab9;

import java.io.*;

public class FileDemo {
    public static void main(String[] args) {

        try {
            File myFile = new File("C:\\Users\\User\\IdeaProjects\\361211760001\\src\\Lab9\\mit.txt");//mit
            if (myFile.createNewFile())
                System.out.println("New file created.");
            else
                System.out.println("File already exited.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        //write File
       // writeMyFile();
        readMyFile();

    }//main

    private static void readMyFile() {
        try {
            FileReader reader = new FileReader("C:\\Users\\User\\IdeaProjects\\361211760001\\src\\Lab9\\mit.txt");
            int i;
            while ((i = reader.read())!= -1) {
                System.out.print((char)i);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }//readMyFile

    private static void writeMyFile() {
        Writer w = null;
        try {
            w = new FileWriter("C:\\Users\\User\\IdeaProjects\\361211760001\\src\\Lab9\\mit.txt",true);
            String content = "\nMIT SAIYAI 2018\r";
            w.write(content);
            System.out.println("Done");
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                w.close();
            } catch (IOException ex){
                ex.printStackTrace();

            }

        }



    }//writeMyfile
}//class