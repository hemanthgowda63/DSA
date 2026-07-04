package Array;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr={80,80,20};
        int largest=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for (int i = 1; i < arr.length ; i++) {
            if(arr[i]>largest){
                secondLargest=largest;
                largest=arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest=arr[i];
            }

        }
        System.out.println(secondLargest);
    }
}
