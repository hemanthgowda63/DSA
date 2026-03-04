class findNumbersInArray {

    public static int findNumbers(int[] nums) {
        int count = 0;

        for (int num : nums) {
            int digits = 0;

            while (num > 0) {
                num = num / 10;
                digits++;
            }

            if (digits % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        System.out.println(findNumbers(nums));
    }
}
