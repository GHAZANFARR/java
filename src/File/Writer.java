package File;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args) throws IOException {
        String fileName = "java-test.txt";
        FileWriter write = null;
        try{
            write = new FileWriter(fileName);
            write.write("My name is Optimus Prime.");
            write.flush();
            System.out.println("text has been saved successfully");
        } catch (IOException e) {
            System.out.printf("something went wrong %s\n", e.getMessage());
        }finally {
            if (write != null) write.close();
        }
    }
}
