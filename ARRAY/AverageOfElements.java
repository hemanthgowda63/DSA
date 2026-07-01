package Array;

import java.util.Scanner;

public class AverageOfElements {
    public static double average(int[] arr,int n){
        int total=0;
        for (int i = 0; i < arr.length; i++) {
            total=total + arr[i];

        }
        return (double) total/n;
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

        System.out.println("Average of All Elements is " +average(arr,n));

    }
}
