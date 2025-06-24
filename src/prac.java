import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class prac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the file name to create: ");
        String fileName = scanner.nextLine();

        try (FileWriter fileWriter = new FileWriter(fileName);){
            fileWriter.write("my name is bullu");
            fileWriter.flush();
        }catch (IOException e){
            System.err.print("error" + e.getMessage());
        }
    }
}
