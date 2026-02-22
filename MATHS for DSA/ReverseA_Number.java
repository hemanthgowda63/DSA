
import java.util.Scanner;
public class ReverseA_Number{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to Reverse it:");
        int  n=in.nextInt();
        int rev=0;

        while(n>0){
            int  lastdigit=n%10;
            rev=(rev*10)+lastdigit;

            n=n/10;
        }
        System.out.print(rev);

    }
}

