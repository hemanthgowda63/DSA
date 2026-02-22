import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String[] args) {
        // palindrome means: the original number become same when you reverse it ex: 121-->121
        Scanner in=new Scanner(System.in);
                System.out.println("Enter a number to check Palindrome or not :");
                int  n=in.nextInt();
                int rev=0;
                int temp=n;

                while(n>0){
                    int  lastdigit=n%10;
                    rev=(rev*10)+lastdigit;
                    n=n/10;
                }
        System.out.println(rev);
        if(temp==rev){
            System.out.println("true");
        }else {
            System.out.println("False");
        }

    }
}
