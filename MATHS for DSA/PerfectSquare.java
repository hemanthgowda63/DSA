class PerfectSquare {

    static boolean isPerfectSquare(int n) {
        int root = (int) Math.sqrt(n);
        return root * root == n;
    }

    public static void main(String[] args) {
        int n = 36;

        if (isPerfectSquare(n))
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}