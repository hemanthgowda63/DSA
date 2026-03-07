import java.util.HashSet;
import java.util.Arrays;

class IntersectionOfArray {
    
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> resultSet = new HashSet<Integer>();

        for(int num : nums1){
            set1.add(num);
        }

        for(int num : nums2){
            if(set1.contains(num)){
                resultSet.add(num);
            }
        }

        int[] result = new int[resultSet.size()];
        int i = 0;

        for(int num : resultSet){
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {

        IntersectionOfArray obj = new IntersectionOfArray();

        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};

        int[] inter = obj.intersection(nums1, nums2);

        System.out.println(Arrays.toString(inter));
    }
}