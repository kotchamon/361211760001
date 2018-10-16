package Lab9;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

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
        writeMyFile();


    }

    private static void writeMyFile() {
        Writer w = null;
        try {
            w = new FileWriter("C:\\Users\\User\\IdeaProjects\\361211760001\\src\\Lab9\\mit.txt");
            String content = "MIT SAIYAI 2018";
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