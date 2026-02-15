package Array;
import java.util.Scanner;

public class CountF {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Numbers in the array:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            System.out.println("The Number" + arr[i] + "is found: " + count + " times");
            count = 0;
        }
    }
}
