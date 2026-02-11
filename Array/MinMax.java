package Array;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Numbers in the array:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<x;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The max is: "+max+" The min is: "+min);
    }
}
