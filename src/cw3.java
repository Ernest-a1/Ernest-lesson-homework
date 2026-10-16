import java.util.Scanner;

public class cw3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("System will print numbers from 1 to N");
        System.out.println(" ");

        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}