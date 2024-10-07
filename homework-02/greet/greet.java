import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name + "!");
        scanner.close();
    }
}
