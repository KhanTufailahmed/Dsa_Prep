package Basics;
import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x=sc.nextInt();
        System.out.println("Enter the second number:");
        int y=sc.nextInt();
        System.out.print("Press + from Addition\n Press - for Substraction\n Press * for Multiplication\n Press / for Division\n Enter your choice:");
        String str=sc.next();
        switch(str){
            case "+":
            System.out.println(x+y);
            break;
            case "-":
            System.out.println(x-y);
            break;
            case "*":
            System.out.println(x*y);
            break;
            case "/":
            System.out.println(x/y);
            break;
            default:
            System.out.println("Invalid Input");
        }
    }
}