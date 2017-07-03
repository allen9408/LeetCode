public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        double len = Math.ceil(Math.log10(Math.abs(x) + 0.1));
        
        for (int i = 0; i < len / 2 + 1; i++) {
            int high = (int)(x / Math.pow(10, len - i - 1)) % 10;
            int low = (int)(x / Math.pow(10, i)) % 10;
            
            if (high != low)
                return false;
        }
        return true;
    }
}