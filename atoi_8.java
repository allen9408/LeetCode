public class Solution {
    public int myAtoi(String str) {
        long result = 0;
        int isPlus = 1;
        boolean passed = false;
        boolean numStart = false;
        boolean hasNum = false;
        for (int i = 0; i < str.length(); i ++){
            if (str.charAt(i) == ' ') {
                if (passed || hasNum) return isPlus*(int)result;
                else continue;
            }
            if ((str.charAt(i) == '+' || str.charAt(i) == '-') && !passed) {
                passed = true;
                if (i == str.length() - 1) return 0;
                isPlus = (str.charAt(i)=='+')?1:-1;
                continue;
            }
            int currentNum = Character.getNumericValue(str.charAt(i)) - Character.getNumericValue('0');
            hasNum = true;
            if (currentNum > 9 || currentNum < 0) return isPlus*(int)result;
            if (currentNum == 0 && !numStart) continue;
            numStart = true;
            result = result * 10 + currentNum;
            if (isPlus * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (isPlus * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return isPlus * (int)result;
    }
}