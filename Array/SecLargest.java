package Array;
import java.util.Scanner;

public class SecLargest {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Numbers in the array:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int secMax = 0;
        int max = 0;
        for (int i = 0; i < x; i++) {
            if (arr[i] > max) {
                secMax = max;

                max = arr[i];
            } else if (arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
        System.out.println("The Max Element in the array is: " + max + " And the Second Largest Number is: " + secMax);
    }
}
