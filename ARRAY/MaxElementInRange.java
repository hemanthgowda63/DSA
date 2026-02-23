public class MaxElementInRange {
    public static void main(String[] args) {
        int[] arr={1,2,20,4,50};
        System.out.println(maxRange(arr,1,3));

    }
    static int maxRange(int[] arr, int start,int end){
           int max = arr[start];
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
        
