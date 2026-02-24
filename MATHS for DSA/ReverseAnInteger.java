public class ReverseAnInteger {
    //Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
    //
    //Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

    //Example 1:
    //Input: x = 123
    //Output: 321
    //Example 2:
    //
    //Input: x = -123
    //Output: -321
    //Example 3:
    //
    //Input: x = 120
    //Output: 21
    public static int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        long rev=0;
        int ld=0;
        while(x>0){
            ld=x%10;
            x=x/10;
            rev=(rev*10)+ld;
        }
        if(rev >= ((int)Math.pow(2,32 )) || rev<=((int)Math.pow(-2,31)) ){
            return 0;
        }

        return isNegative ? (int)-rev :(int) rev;
    }

    public static void main(String[] args) {

        System.out.println(reverse(-55514));

    }
}
