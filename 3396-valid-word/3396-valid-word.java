class Solution {
    public boolean isValid(String word) {
        if(word.length() <= 2){
            return false;
        }
        int v=0, c=0;
        for(char ch: word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            } else {
                if("aeiouAEIOU".indexOf(ch) != -1){
                    v++;
                } else if (Character.isLetter(ch)){
                    c++;
                }
            }
        }
        return v >=1 && c >=1;
    }
}