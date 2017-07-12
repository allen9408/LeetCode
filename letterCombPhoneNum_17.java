public class Solution {
    private String[] dictionary = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return new ArrayList<String>();
        if (digits.length() == 1) {
            String letters = dictionary[Integer.parseInt(digits)];
            List<String> result = new ArrayList<String>(Arrays.asList(letters.split("")));
            return result;
        }
        int msb = digits.charAt(0) - '0';
        List<String> currentBit = new ArrayList<String>(Arrays.asList(dictionary[msb].split("")));
        List<String> finalResult = new ArrayList<String>();
        for (String a : currentBit) {
            List<String> rest = letterCombinations(digits.substring(1, digits.length()));
            for (String b : rest) {
                finalResult.add(a+b);
            }
        }
        return finalResult;
    }
}