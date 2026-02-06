package Basics;
import java.util.Scanner;

class Adult {
    public static void main(String args[]) {
        System.out.println("Enter the age:");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are not an adult");
        }
    }
}