public class PalindromeCheck {
    public static void main(String[] args) {
        String input = "RaceCar";
        System.out.println(isPalindrome(input)); // should print true
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replace(" ", ""); // make it case-insensitive + remove spaces
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
