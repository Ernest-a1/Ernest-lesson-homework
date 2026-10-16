import java.util.Scanner;

public class cw0910c {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i=1;
        int a=0;
        int b=0;
        int c=0;
        int d=0;
        int e=0;
        while (i<=10) {
            System.out.println("Enter " + i + " number: ");

            int n = scanner.nextInt();

            if(n>0)
                a++;
            else if(n<0)
                b++;
            else if(n==0)
                c++;
            else if(n%2==0)
                d++;
            else if(n%2==1)
                e++;
            i++;
        }
        System.out.println("==== STATISTICS ====");
        System.out.println("Positive numbers: " + a);
        System.out.println("Negative numbers: " + b);
        System.out.println("Zeros: " + c);
        System.out.println("Even numbers: " + d);
        System.out.println("Odd numbers: " + e);
    }
}
