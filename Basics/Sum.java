package Basics;

import java.util.Scanner;

public class Sum {
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Sum s = new Sum();
        int z = s.add(a, b);
        System.out.println(z);
    }
}
