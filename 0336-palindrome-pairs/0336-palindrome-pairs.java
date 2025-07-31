class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(new StringBuilder(words[i]).reverse().toString(), i);
        }
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int len = word.length();
            for (int j = 0; j <= len; j++) {
                String prefix = word.substring(0, j);
                String suffix = word.substring(j);
                if (isPalindrome(word, 0, j - 1)) {
                    Integer idx = map.get(suffix);
                    if (idx != null && idx != i) {
                        result.add(List.of(idx, i));
                    }
                }
                if (j != len && isPalindrome(word, j, len - 1)) {
                    Integer idx = map.get(prefix);
                    if (idx != null && idx != i) {
                        result.add(List.of(i, idx));
                    }
                }
            }
        }
        result.sort((a, b) -> a.get(0).equals(b.get(0)) ? a.get(1) - b.get(1) : a.get(0) - b.get(0));
        return result;
    }
    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}
