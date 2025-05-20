import java.util.HashMap;

public class CharCount {
    public static void main(String[] args) {
        String input = "banana";
        HashMap<Character, Integer> charMap = new HashMap<>();

        for (char c : input.toCharArray()) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        for (char c : charMap.keySet()) {
            System.out.println(c + ": " + charMap.get(c));
        }
    }
}
