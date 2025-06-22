package File;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
    public static void main(String[] args) {
        String fileName = "java-test.txt";
        try(FileWriter write = new FileWriter(fileName)){ //automatically handle the exceptions in within the bracket
            write.write("My name is Optimus Prime.");
            write.flush();
            System.out.println("text has been saved successfully");
        } catch (IOException e) {
            System.out.printf("something went wrong %s\n", e.getMessage());
        } //no need to finally in try-with-resource
    }
}
