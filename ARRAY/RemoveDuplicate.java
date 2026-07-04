package Array;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4};
        int j=1;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]!=arr[i-1]){
                arr[j]=arr[i];
                j++;

            }
        }
        for (int i = 0; i < j; i++) {
            System.out.println(arr[i]);

        }
    }
}
