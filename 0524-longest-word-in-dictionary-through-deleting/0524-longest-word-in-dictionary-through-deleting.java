class Solution {
    private boolean isSubseq(String a, String b){
        int j = 0;
        for(int i = 0; i < b.length() && j < a.length(); i++){
            if(a.charAt(j) == b.charAt(i)) j++;
        }
        return j == a.length();
    }

    public String findLongestWord(String s, List<String> dictionary) {
        String max_str = "";
        for (String str: dictionary){
            if(isSubseq(str, s)){
                if(str.length() > max_str.length() || (str.length() == max_str.length() && str.compareTo(max_str) < 0))
                    max_str = str;
            }
        }
        return max_str;
    }
}