import java.util.Scanner;

public class StudentGrader{
    public static int calculateGrade(int a){
        if(a<0 && a>100 ){
            System.out.println("The score should be between 0 and 100.");
        }else if(a>=90){
            System.out.println("You got A");
        }else if(a>=80){
            System.out.println("You got B");
        }else if(a>=70){
            System.out.println("You got C");
        }else if(a>=60){
            System.out.println("You got D");
        }else{
            System.out.println("You got F");
        }
        return a;
    }
    public static void main(String[] args){
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter your score: ");
        int b = s1.nextInt();
        calculateGrade(b);
    }
}
