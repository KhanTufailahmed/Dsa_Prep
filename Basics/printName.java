package Basics;
import java.util.Scanner;

public class printName {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        System.out.println("Tell me your Name:");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        printName.printMyName(str);
    }
}
