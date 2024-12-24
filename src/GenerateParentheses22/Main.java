import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> ans = solution.generateParenthesis(3);
        for (int index = 0; index < 3; index++) {
            System.out.printf("%s |", ans.get(index));
        }
    }
}


class Solution {
    private static void rec(int a, int b, int currentIndexToAddValue, char[] currentValue, List<String> ans) {
        if (a == 0 && b == 0) {
            ans.add(new String(currentValue));
            return;
        }
        if (a > 0) {
            currentValue[currentIndexToAddValue] = '(';
            rec(a-1, b, currentIndexToAddValue+1, currentValue, ans);
        }
        if (b > 0 && b > a) {
            currentValue[currentIndexToAddValue] = ')';
            rec(a, b-1, currentIndexToAddValue+1, currentValue, ans);
        }
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        char[] value = new char[2*n];
        rec(n, n, 0, value, ans);
        return ans;
    }
}