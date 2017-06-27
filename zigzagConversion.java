public class Solution {
    public String convert(String s, int numRows) {
        char[] c = s.toCharArray();
        int len = c.length;
        StringBuffer[] sb = new StringBuffer[numRows];
        for (int i = 0; i < sb.length; i ++)
            sb[i] = new StringBuffer();
        int index = 0;
        while (index < len) {
            for (int i = 0; i < numRows && index < len; i++) {
                sb[i].append(c[index++]);
            }
            for (int i = numRows - 2; i > 0 && index < len; i--) {
                sb[i].append(c[index++]);
            }
        }
        for (int i = 1; i < numRows; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
}