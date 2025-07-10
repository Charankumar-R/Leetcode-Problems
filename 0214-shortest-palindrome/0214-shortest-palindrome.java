class Solution {
    public String shortestPalindrome(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        String comb = s + "#" + rev;
        int[] prefix_table = builderPrefixTable(comb);

        int pal_length = prefix_table[comb.length() - 1];
        StringBuilder suffix = new StringBuilder(s.substring(pal_length)).reverse();
        return suffix.append(s).toString(); 
    }

    private int[] builderPrefixTable(String s){
        int[] prefix_table = new int[s.length()];
        int length = 0;
        for(int i = 1; i < s.length(); i++){
            while (length > 0 && s.charAt(i) != s.charAt(length)) {
                length = prefix_table[length - 1];
            }
            if (s.charAt(i) == s.charAt(length)){
                length++;
            }
            prefix_table[i] = length;
        }
        return prefix_table;
    }
}