import java.util.Scanner;

class SqrtX {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int start = 1;
        int end = x;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long sq = (long) mid * mid;

            if (sq == x) return mid;
            if (sq > x) end = mid - 1;
            else start = mid + 1;
        }

        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(new SqrtX().mySqrt(x));
    }
}
