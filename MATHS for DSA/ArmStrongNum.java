public class ArmStrongNum {
    public static boolean isArmstrong(int n) {

        int original = n;
        int digits = String.valueOf(n).length();
        int sum = 0;

        while (n > 0) {
            int d = n % 10;
            sum += Math.pow(d, digits);
            n = n / 10;
        }

        return sum == original;
    }

    public static void main(String[] args) {
        int num = 153;

        if (isArmstrong(num))
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong Number");
    }
}