/* You are required to complete below method */

class Solution {
    int countPS(String s) {
        int n = s.length();
        return helper(s, 0, n - 1);
    }

    // count palindromic subsequences in s[l..r]
    int helper(String s, int l, int r) {
        if (l > r) return 0;
        if (l == r) return 1;  // single character is palindrome

        int count = 0;

        // include both ends
        if (isPalindrome(s, l, r)) {
            count++;
        }

        // try all subsequences by moving left and right
        count += helper(s, l + 1, r);
        count += helper(s, l, r - 1);
        count -= helper(s, l + 1, r - 1); // avoid double counting

        return count;
    }

    boolean isPalindrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
