public class Solution {
    public boolean isValid(String s) {
        List<Character> symbols = Arrays.asList('(', ')', '{', '}', '[', ']');
        Stack<Character> st = new Stack<Character>();
        // TODO: replace list to enumeration
        for (int i = 0; i < s.length(); i++) {
            Character cur_c = new Character(s.charAt(i));
            if (!symbols.contains(cur_c))
                continue;
            if (symbols.indexOf(cur_c) % 2 == 0) {
                // left part
                st.push(cur_c);
            } else {
                // right part
                if (st.empty()) return false;
                Character c = st.pop();
                if (symbols.indexOf(cur_c) != symbols.indexOf(c) + 1)
                    return false;
            }
        }
        if (!st.empty()) return false;
        return true;
    }
}