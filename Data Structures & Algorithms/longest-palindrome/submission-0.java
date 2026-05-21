class Solution {
    public int longestPalindrome(String s) {
        if (s.length() == 1) {
            return 1;
        }

        HashMap<Character, Integer> counts = new HashMap<>();
        Boolean isOdd = false;
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int count = 1;
            if (counts.containsKey(c)) {
                count = counts.get(c);
                count++;
            }
            counts.put(c, count);
        }

        for (int value : counts.values()) {
            System.out.println(value);
            if (value % 2 == 0) {
                counter += value;
            } else {
                isOdd = true;
                value -= 1;
                counter += value;
            }
        }

        if (isOdd) {
            counter++;
        }
        return counter;
    }
}