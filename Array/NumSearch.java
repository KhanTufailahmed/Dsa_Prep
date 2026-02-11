package Array;
import java.util.Scanner;

public class NumSearch {

    public static void main(String[] args) {
        System.out.println("Enter the number:");
        int arr[]={12,2,4,5,7,6,90};
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(x==arr[i]){
                System.out.println("The Number found at the Index:"+i);
            }
        }
    }
}