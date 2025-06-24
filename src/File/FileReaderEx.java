package File;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args) {
        String fileName = "java-test.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int read; // cant declare it as char before checking
            do {
                read = reader.read();
                if (read != -1) {
                    System.out.print((char)read); //change it in char before printing
                }
            } while (read != -1);
        }catch (IOException e) {
            System.out.print(e.getMessage());
        }
    }
}
