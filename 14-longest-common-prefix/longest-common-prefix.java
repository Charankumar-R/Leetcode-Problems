class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }

        int min=Integer.MAX_VALUE;
        for(String s:strs){
            if(s.length()<min){
                min=s.length();
            }
        }
        int i=0;
        while(i<min){
            for(String s:strs){
                if(s.charAt(i) != strs[0].charAt(i)){
                    return strs[0].substring(0,i);
                }
            }
            i++;
        }
        return strs[0].substring(0,i);
    }
}