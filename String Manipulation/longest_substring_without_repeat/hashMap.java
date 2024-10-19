import java.util.*;

class hashMap {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        int count = 0;
        int left = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < l; r++) {
            char cur = s.charAt(r);
            if (map.containsKey(cur)) {
                left = Math.max(left, map.get(cur) + 1);
            }

            map.put(cur, r);

            count = Math.max(count, r - left + 1);
        }

        return count;
    }
}