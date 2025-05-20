public class FindMax {
    public static void main(String[] args) {
        int[] nums = {3, 9, 2, 14, 7};
        int max = nums[0]; // Assume the first number is the max

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        System.out.println("Max value is: " + max);
    }
}
