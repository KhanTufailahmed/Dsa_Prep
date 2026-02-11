package Array;
import java.util.Scanner;

public class Sorted {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Numbers in the array:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int flag=1;
        for(int i=0;i<x-1;i++){
            if(arr[i+1]<arr[i]){
                flag=0;
                break;
            }
        }
        if(flag==0){
            System.out.println("The array is not Sorted");
        }else{
            System.out.println("The Array is Sorted");
        }
    }
}
