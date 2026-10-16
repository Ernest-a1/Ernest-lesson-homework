import java.util.Scanner;

public class hw0910 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("====Ernest ATM====");
        int a = 4734;
        int b = 3;
        double d1 = 1000;
        int e = 4;

        while (b > 0) {
            System.out.println("Enter PIN: ");
            int pass = s1.nextInt();

            if (pass == a) {
                System.out.println("Login successful!");

                do{
                    System.out.println(" ");
                    System.out.println("====ATM MENU====");
                    System.out.println("1. Check balance");
                    System.out.println("2. Deposit money");
                    System.out.println("3. Withdraw money!");
                    System.out.println("4. Exit");
                    System.out.println(" ");
                    System.out.println("Choose an option: ");
                    int o = s1.nextInt();

                    if (o == 1) {
                        System.out.println("Yor current balance is: $" + d1);
                    }
                    else if (o==2){
                        System.out.println("Enter deposit amount: ");
                        double d2 = s1.nextDouble();
                        if(d2>0){
                            d1 +=d2;
                            System.out.println("Deposit successful!");
                            System.out.println("Your new balance: " + d1);
                        }
                        else{
                            System.out.println("The amount must be greater than zero.");
                        }
                    }
                    else if(o==3){
                        System.out.println("Enter withdraw amount: ");
                        double d3 = s1.nextDouble();
                        if(d3>0 && (d1>d3)){
                            d1-=d3;
                            System.out.println("Withdraw successful!");
                            System.out.println("Your new balance: " + d1);
                        }
                        else{
                            System.out.println("The amount must be greater than zero.");
                            System.out.println("The amount must not be greater than the current balance.");
                        }
                    }
                    else if(o==4){
                        e-=o;
                        System.out.println("Thank you for using Ernest ATM!");
                        System.out.println(" ");
                    }
                    else{
                        System.out.println(" ");
                        System.out.println("Uncorrect option!");
                    }
                } while(e!=0);
                return;
            }

            b-= 1;
            System.out.println("Incorrect PIN.");
            System.out.println("Attempts left: " + b);
            System.out.println();
        }

        System.out.println("Your card has been blocked.");
    }
}