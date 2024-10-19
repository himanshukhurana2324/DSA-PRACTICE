import java.util.HashSet;

class hashSet {
    public int lengthofLongestSubstring(String s) {
        int n = s.length();
        int longest = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            longest = Math.max(longest, right - left + 1);
        }

        return longest;
    }
}