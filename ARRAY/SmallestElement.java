package Array;

import java.util.Scanner;

public class SmallestElement {
    public static int small(int[] arr){
        int small=arr[0];
        for(int i=1;i< arr.length;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements: ");
        for(int i=0;i< arr.length;i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println(small(arr));

    }
}
