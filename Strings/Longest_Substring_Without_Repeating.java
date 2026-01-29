class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();
        int left = 0, right = 0, maxLen = 0;

        while (right < s.length()) {
            char ch = s.charAt(right);

            if (!hs.contains(ch)) {
                hs.add(ch);
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                hs.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}

