public class unique {

    public static void unique(){
        int[] arr={21,20,20,50,12};
        for(int i=0;i< arr.length-2;i++){
            for(int j=i+1;j< arr.length-1;j++) {
                if (arr[i] == arr[j]){
                    System.out.println("NOT UNIQUE");
                break;
            }

            }
        }

    }
    public static void main(String args[]){
        unique();


    }
}
