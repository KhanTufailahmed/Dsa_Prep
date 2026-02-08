package BasicPattern;
import java.util.Scanner;
// 1 
// 0 1
// 0 1 0
// 1 0 1 0
// 1 0 1 0 1
public class Patt9 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the box:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (x == 0) {
                    System.out.print(x+" ");
                    x = 1;
                } else {
                    System.out.print(x+" ");
                    x = 0;
                }
            }
            System.out.println();
        }

    }
}
