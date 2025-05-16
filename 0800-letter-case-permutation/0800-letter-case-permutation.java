import java.util.*;
class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> out=new ArrayList<>();
        out.add("");
        for(char c : s.toCharArray()){
            List<String> tmp=new ArrayList<>();
            if(Character.isLetter(c)){
                for(String o:out){
                    tmp.add(o+Character.toLowerCase(c));
                    tmp.add(o+Character.toUpperCase(c));
                }
            }else{
                for(String o:out){
                    tmp.add(o+c);
                }
            }
            out=tmp;
        }
        return out;
    }
}