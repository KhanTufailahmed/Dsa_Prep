package BasicPattern;
import java.util.Scanner;
// ****
// ****
// ****
// ****
public class Patt1 {
    public static void main(String[] args) {
        System.out.println("Ente the box Size:");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
