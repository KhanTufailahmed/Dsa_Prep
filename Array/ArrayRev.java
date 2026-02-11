package Array;
import java.util.Scanner;

public class ArrayRev {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Numbers in the array:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int temp = 0;
        for (int i = 0; i < x/2; i++) {
            temp = arr[x - 1 - i];
            arr[x - 1 - i] = arr[i];
            arr[i] = temp;
        }
        for(int i=0;i<x;i++){
            System.out.println(arr[i]);
        }
    }
}
