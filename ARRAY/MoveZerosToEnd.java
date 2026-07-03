package Array;

public class MoveZerosToEnd {
    public static void main(String[] args) {

        int[] arr = {10, 20, 0, 0, 3, 50, 0, 0, 5};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }
            while (j < arr.length) {
                arr[j] = 0;
                j++;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

}