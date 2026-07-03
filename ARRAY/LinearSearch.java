package Array;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 500;
        int index=-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target) {
                index=i;

                break;
            }



        }if(index!=-1){
            System.out.println("Found at index : "+index);
        }else{
            System.out.println("Not found");
        }

    }
}
