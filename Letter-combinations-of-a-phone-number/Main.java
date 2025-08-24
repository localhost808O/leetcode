class Solution {
    private Map<Character, String> phoneLetters = Map.of(    '2', "abc",
            '3', "def",
            '4', "ghi",
            '5', "jkl",
            '6', "mno",
            '7', "pqrs",
            '8', "tuv",
            '9', "wxyz");
    private List<String> ans = new ArrayList<>();
    private StringBuilder sb = new StringBuilder();
    private void f(List<String> lst, int counter) {
        if (counter == lst.size()) {
            for (char c : lst.get(counter-1).toCharArray()) {
                ans.add(sb.toString)
                sb.append(c);
                ans.add(sb.toString());
                sb.deleteCharAt(sb.length()-1);
            }
            return;
        }

        for (char c : lst.get(counter-1).toCharArray()) {
            sb.append(c);
            f(lst, counter+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) {
        List<String> letters = new ArrayList<>();
        digits.chars().mapToObj(c -> (char) c).forEach(c -> {
            String value = phoneLetters.get(c);
            if (value != null) {
                letters.add(value);
            }
        });
         if (letters.size() == 0) {
            return letters;
        }
        f(letters, 1);
        return ans;
    }
}
