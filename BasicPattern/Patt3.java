package BasicPattern;
import java.util.Scanner;

// *
// **
// ***
// ****
// *****
public class Patt3 {
    public static void main(String[] args) {
        System.out.println("Enter the size of the table:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=1;i<=x;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}