class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for(int i = 0; i < magazine.length(); i ++) {
            char c = magazine.charAt(i);
            if (counts.containsKey(c)) {
                int count = counts.get(c);
                count++;
                counts.put(c, count);
            } else {
                counts.put(c, 1);
            }
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            if(counts.isEmpty()) {
                return true;
            } else {
                char c = ransomNote.charAt(i);
                if (counts.containsKey(c)) {
                    int count = counts.get(c);
                    if(count == 0) {
                        return false;
                    }
                    count--;
                    counts.put(c, count);
            } else {
                    return false;
                }
            }
        }
        return true;
    }
}