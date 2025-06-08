import java.util.Scanner;

class students {
    String name;
    int age;

    public students() {
    }

    public students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String nameCall (){
        System.out.print("what is your name: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public int ageCall (){
        System.out.print("what is your age: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("students{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}

public class PrintToString {
    public static void main(String[] args) {
        students student = new students();

        student.name = student.nameCall();
        student.age = student.ageCall();

        System.out.println(student.toString());
    }
}
