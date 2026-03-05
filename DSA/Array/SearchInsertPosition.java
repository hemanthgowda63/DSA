public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};

        int target1 = 5;  // existing element
        int target2 = 2;  // between 1 and 3
        int target3 = 7;  // greater than all elements
        int target4 = 0;  // smaller than all elements

        System.out.println("Index for 5: " + searchInsert(nums, target1)); // 2
        System.out.println("Index for 2: " + searchInsert(nums, target2)); // 1
        System.out.println("Index for 7: " + searchInsert(nums, target3)); // 4
        System.out.println("Index for 0: " + searchInsert(nums, target4)); // 0
    }
}
