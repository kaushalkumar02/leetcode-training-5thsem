import java.util.HashSet;

class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            // Duplicate character mila
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }

            // Current character add karo
            set.add(s.charAt(right));

            // Maximum length update karo
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}