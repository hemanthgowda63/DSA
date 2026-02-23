import java.util.Arrays;
import java.util.Scanner;

public class MultidimensionArray {
    public static void main(String[] args) {

            /*
                1 2 3
                4 5 6
                7 8 9
             */


//
//        int [][] arr={
//                {1,2,3},
//                {4,5},
//                {6,7,8,9,10}
//        };
//        System.out.println(arr2d[2][1]);


//
//                int [] [] arr=new int [3][3];
//
//        System.out.println(arr.length);
//        Scanner in=new Scanner(System.in);
//        //INPUT
//        for(int row=0; row<arr.length; row++){
//            // for each col in every row
//            for(int col=0; col<arr[row].length; col++){
//                arr[row][col]=in.nextInt();
//            }
//        }


        //OUTPUT
//        for(int row=0; row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+  " ");
//            }
//            System.out.println();
//        }

//Using Enhanced for loop

//        for(int[] a: arr){
//            System.out.println(Arrays.toString(a));
//        }

        String[] str=new String[4];


        for(String i: str){
            System.out.println(i);
        }
    }
}
