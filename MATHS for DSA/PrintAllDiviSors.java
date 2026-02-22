import java.sql.SQLOutput;
import java.util.*;

import static java.lang.Math.sqrt;

public class PrintAllDiviSors {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a number:");
        int  n=in.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i=1;i<=sqrt(n);i++){
            if(n%i==0){
                list.add(i);
                if((n/i)!= i){
                    list.add(n/i);
                }

            }
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
