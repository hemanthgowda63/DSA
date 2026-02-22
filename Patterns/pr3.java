public class pr3 {
    public static void main(String[] args) {
        print(5);

    }
    static void print(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                int sum=i+j;
                if(sum%2==0){
                    System.out.print("1");
                }else
                System.out.print("0");

            }
            System.out.println();
        }
    }
    static void print2(int n){
        for(int i=1;i<=n;i++){


                int start;
                if(i%2==0)start=1;
                else start =0;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }



            System.out.println();
        }
    }

}
