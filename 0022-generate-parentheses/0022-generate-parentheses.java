import java.util.*;
class Solution {
    public List<String> generateParenthesis(int n) {
        // Store all valid combinations
        List<String> result = new ArrayList<>();
        // Start recursion
        backtrack(result, "", 0, 0, n);
        // Return all combinations
        return result;
    }
    private void backtrack(
            List<String> result,
            String current,
            int open,
            int close,
            int n) {
        // If all brackets are used, store the string
        if (open == n && close == n) {
            result.add(current);
            return;
        }
        // We can add '(' if open count is less than n
        if (open < n) {
            backtrack(
                result,
                current + "(",
                open + 1,
                close,
                n
            );
        }
        // We can add ')' only if close is less than open
        if (close < open) {
            backtrack(
                result,
                current + ")",
                open,
                close + 1,
                n
            );
        }
    }
}