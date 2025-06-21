package File;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) {
        String fileName = "java-test.txt";
        try{
            FileWriter write = new FileWriter(fileName);
            write.write("My name is Optimus Prime.");
            write.flush();
            System.out.println("text has been saved successfully");
        } catch (IOException e) {
            System.out.printf("something went wrong %s\n", e.getMessage());
        }
    }
}
