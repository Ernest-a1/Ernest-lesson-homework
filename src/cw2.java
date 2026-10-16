public class cw2 {
    public static void main(String[] args) {

        int i = 1;
        do {
            System.out.println("Before: " + i);
            i *= 10;
            System.out.println("Before: " + i);
            System.out.println(" ");
        } while(i <= 10000);
    }
}