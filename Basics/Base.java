package Basics;


import java.util.Scanner;

public class Base {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How was the day?");
        String day = sc.nextLine();
        System.out.println("The day was " + day);
    }
}
