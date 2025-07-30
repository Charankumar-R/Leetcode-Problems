class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> result = new ArrayList<>();
        Map<String, Integer> reversedWordMap = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            reversedWordMap.put(new StringBuilder(words[i]).reverse().toString(), i);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = 0; j <= word.length(); j++) {
                String prefix = word.substring(0, j);
                String suffix = word.substring(j);

                if (isPalindrome(word, 0, j - 1)) {
                    Integer reversedSuffixIdx = reversedWordMap.get(suffix);
                    if (reversedSuffixIdx != null && reversedSuffixIdx != i) {
                        result.add(Arrays.asList(reversedSuffixIdx, i));
                    }
                }

                if (j != word.length() && isPalindrome(word, j, word.length() - 1)) {
                    Integer reversedPrefixIdx = reversedWordMap.get(prefix);
                    if (reversedPrefixIdx != null && reversedPrefixIdx != i) {
                        result.add(Arrays.asList(i, reversedPrefixIdx));
                    }
                }
            }
        }

        return result;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}