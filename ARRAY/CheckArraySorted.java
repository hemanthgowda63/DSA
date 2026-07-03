package Array;

public class CheckArraySorted {
    public static void main(String[] args) {
        int [] arr={0,1,2};
        boolean isSorted=true;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }

        } if(isSorted){
            System.out.println("  SORTED");
        }else{
            System.out.println("NOT SORTED");
        }
    }
}
