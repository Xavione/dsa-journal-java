public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
