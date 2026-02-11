import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter the size of the array:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int arr[] = new int[x];
        System.out.println("Enter the Numbers in the array and the array should be sorted:");
        for (int i = 0; i < x; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < x; i++) {
            if(arr[i]>=arr[i-1]){
                if(arr[i]==arr[i-1]){
                    arr[i]=0;
                }
            }
        }

        for (int i = 0; i < x; i++) {
            System.out.println(arr[i]);
        }
    }
}
