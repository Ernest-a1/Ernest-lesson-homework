import java.util.Scanner;

public class cw0910a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 8754;
        int b = 3;

        while (b > 0) {
            System.out.println("Enter PIN: ");
            int pass = scanner.nextInt();

            if (pass == a) {
                System.out.println("Access granted!");
                scanner.close();
                return;
            }

            b--;
            System.out.println("Incorrect PIN.");
            System.out.println("Attempts left: " + b);
            System.out.println();
        }

        System.out.println("Card blocked.");
    }
}