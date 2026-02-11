package Basics;
import java.util.Scanner;

public class Fibbo {
    public static void main(String[] args) {
        System.out.println("Enter the index till where the series should go:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=0;
        int z=1;
        int a=y+z;
        System.out.println(y);
        System.out.println(z);
        for(int i=1;i<=x;i++){
            System.out.println(a);
            y=a;
            a=a+z;
            z=y;
        }
    }
}
