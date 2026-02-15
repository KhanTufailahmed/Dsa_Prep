package Array;
import java.util.Scanner;

public class Insertion {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        int arr1[] = new int[x];
        System.out.println("Enter the Numbers in the 1 array:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the Numbers in the 2 array:");
        for (int i = 0; i < x; i++) {
            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                if(arr[i]==arr1[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
