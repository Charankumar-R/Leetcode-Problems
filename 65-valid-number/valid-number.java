class Solution {
    public boolean isNumber(String s) {
        
        //least Runtime 
        // Time Complexity O(1)
        // Space Complexity O(n)

        s = s.trim();

        boolean digitSeen = false;
        boolean dotSeen = false;
        boolean eSeen = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                digitSeen = true;
            } else if (c == '+' || c == '-') {
                if (i > 0 && s.charAt(i - 1) != 'e' && s.charAt(i - 1) != 'E') {
                    return false;
                }
            } else if (c == '.') {
                if (dotSeen || eSeen) {
                    return false;
                }
                dotSeen = true;
            } else if (c == 'e' || c == 'E') {
                if (eSeen || !digitSeen) {
                    return false;
                }
                eSeen = true;
                digitSeen = false;
            } else {
                return false;
            }
        }

        return digitSeen;

        // More runtime 

        // try{
        //     Double.valueOf(s);
        //     return Character.isDigit(s.charAt(s.length() - 1)) || s.charAt(s.length() - 1) == '.';
        // } catch(Exception e){
        //     return false;
        // }
    }
}