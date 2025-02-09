class Solution {
    public String mergeAlternately(String word1, String word2) {
        int w1=word1.length();
        int w2=word2.length();
        int a=0,b=0;
        StringBuilder ans=new StringBuilder();
        while(a<w1 && b<w2){
            ans.append(word1.charAt(a++));
            ans.append(word2.charAt(b++));
        }
        while(a<w1){
            ans.append(word1.charAt(a++));
        }
        while(b<w2){
            ans.append(word2.charAt(b++));
        }
        return ans.toString();
    }
}