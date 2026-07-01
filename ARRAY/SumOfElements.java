package Array;

import java.util.Scanner;

public class SumOfElements {
    public static int sum(int[] arr){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total=total + arr[i];

        }
        return total;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter " + n + " Elements: ");
        for(int i=0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array elements are:");

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }

        sc.close();

        System.out.println("Sum of All Elements is " + sum(arr));

    }
}
