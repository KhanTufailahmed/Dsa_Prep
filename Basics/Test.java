package Basics;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        System.out.println("Enter the Second Number:");

        int y = sc.nextInt();
        if (x == y) {
            System.out.println("Equal");
        } else if (x > y) {
            System.out.println("Greater");
        } else {
            System.out.println("Smaller");
        }

    }
}
