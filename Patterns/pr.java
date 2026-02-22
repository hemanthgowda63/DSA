import java.util.Scanner;
public class pr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            print(n);
            print2(n);


        }
    }
    static void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
            }
            //optional
            for (int j = 1; j <= n - i + 1; j++) {
               System.out.print(" ");
         }
            System.out.println();
        }
    }
}
