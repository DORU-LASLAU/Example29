import java.util.Scanner;
public class Example29 {
    public static void main (String[] argv) {
        int x, y;
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter first number:");
        x =inputValue.nextInt();
        System.out.println("Enter second number:");
        y = inputValue.nextInt();

        while (x>y) {
            x=x-y;
            System.out.println(x);
        }
    }
}
