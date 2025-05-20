public class SumArray {
    public static void main(String[] args) {
        int[] nums = {5, 10, 15, 20};
        int sum = 0;

        for (int num : nums) {
            sum += num; // same as: sum = sum + num
        }

        System.out.println("Total sum is: " + sum);
    }
}
