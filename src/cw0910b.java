import java.util.Scanner;

public class cw0910b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 67;
        int b = 5;
        int c = 6;

        while (b > 0) {
            System.out.println("Enter your guess: ");
            int gg = scanner.nextInt();

            if (gg == a) {
                System.out.println("Correct!");
                System.out.println("You needed " + (c - b) + " attempts");
                scanner.close();
                return;
            }
            b--;
            if (gg < 67) {
                System.out.println("Too Low.");
                System.out.println("Attempts left: " + b);
                System.out.println();
            }
            else {
                System.out.println("Too high.");
                System.out.println("Attempts left: " + b);
                System.out.println();
            }
        }
        System.out.println("Game over!");
        System.out.println("The secret number was 67");
    }
}