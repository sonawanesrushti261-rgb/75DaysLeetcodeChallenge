class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {
            return new ArrayList<>();
        }

        return helper("", digits);
    }

    private List<String> helper(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        String[] mapping = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        int digit = up.charAt(0) - '0';
        String letters = mapping[digit];

        ArrayList<String> list = new ArrayList<>();

        for (char ch : letters.toCharArray()) {
            list.addAll(helper(p + ch, up.substring(1)));
        }

        return list;
    }
}