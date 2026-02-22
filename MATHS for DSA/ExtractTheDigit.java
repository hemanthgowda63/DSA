import java.sql.SQLOutput;
import java.util.Scanner;
public class ExtractTheDigit {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number to extract digits:");
       int  n=in.nextInt();
        int count=0;

       while(n>0){
         int  lastdigit=n%10;

         count=count+1;
           System.out.print(lastdigit+" ");
           n=n/10;
       }
        System.out.println("number digits: "+count);
    }
}
