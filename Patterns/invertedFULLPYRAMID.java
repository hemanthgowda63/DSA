import java.util.Scanner;
public class invertedFULLPYRAMID {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        print ob=new print();
        print2 ob2=new print2();

        ob2.print(n);
        ob.pr(n);


    }
}

class print{
    void pr(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
class print2 {
    static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            //optional
            for (int j = 0; j < n - i + 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}