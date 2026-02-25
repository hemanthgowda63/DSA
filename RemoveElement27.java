public class RemoveElement27 {

        public static int removeElement(int[] nums, int val) {
            int i=0;
            int k=0;
            while(i<=nums.length-1){
                if(nums[i]!=val){
                    k++;
                }
                i++;
            }

            return k;
        }

    public static void main(String[] args) {
            int[] num={3,2,2,3,5,3,2,3};
            int val=3;
        System.out.println(removeElement(num,val));
    }
    }

