public class Solution {
    private int low, len;
    public String longestPalindrome(String s) {
        if (s.length() < 2) {
            return s;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            isPalindoric(s, i, i);
            isPalindoric(s, i, i + 1);
        }
        return s.substring(low, low + len);
    }
    private void isPalindoric(String s, int lo, int hi) {
        while (lo >= 0 && hi < s.length() && s.charAt(lo) == s.charAt(hi)) {
            lo--;
            hi++;
        }
        if ((hi - lo - 1) > len) {
            low = lo + 1;
            len = hi - lo - 1;
        }
    }
}