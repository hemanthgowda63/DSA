public class Fibonacci_Basic {

    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        Fibonacci_Basic fb = new Fibonacci_Basic();
        int n = 10;
        System.out.println(fb.fib(n));
    }
}
