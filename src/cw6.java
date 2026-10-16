//import java.util.Scanner;
//
//public class cw6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("System will print Odd Numbers up to N");
//        System.out.println(" ");
//
//        System.out.println("Enter N: ");
//        int n = scanner.nextInt();
//
//        int i = 1;
//
//        while (i <= n) {
//
//            System.out.println(i);
//            i += 2;
//            System.out.println(" ");
//        }
//    }
//}

//import java.util.Scanner;
//
//public class cw6 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("System will print Odd Numbers up to N");
//        System.out.println(" ");
//
//        System.out.println("Enter N: ");
//        int n = scanner.nextInt();
//
//        int i = 1;
//         do{
//             System.out.println(" ");
//             System.out.println(i);
//             i += 2;
//         } while(i<=n);
//    }
//}

import java.util.Scanner;

public class cw6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("System will print Odd Numbers up to N");
        System.out.println("Enter N: ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i += 2)
            System.out.println(i);
    }
}