import java.util.Arrays;
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        //Array of Primitives
//        int[] ar=new int[5];
//        ar[0]=10;
//        ar[1]=25;
//        ar[2]=36;
//        ar[3]=62;
//        ar[4]=45;
//        for(int i: ar){
//            System.out.println(i);
//        }

//        for(int i=0; i<ar.length; i++){
//
//            ar[i]=in.nextInt();//take input from user
//                        System.out.println(ar[i]);





//      array of objects
        String[] str=new String[4];
        for(int i=0; i<str.length; i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}