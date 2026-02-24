public class PrimeNumber {
    public static void main(String[] args) {
        //System.out.println(prime(1));
        System.out.println(primeSquareroot(55));

    }
    static boolean prime(int n){
        int count=0;
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                count++;
            }

        }
        if(count==2){
            return true;
        }return false;
    }

    static boolean primeSquareroot(int n){
        int count=0;
        for (int i = 1; i*i <=n ; i++) {
            if(n%i==0){
                count++;
                if((n/i) != i){
                    count++;
                }
            }

        }
        if(count==2){
            return true;
        }return false;

    }

}
