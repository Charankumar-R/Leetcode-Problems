class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen = 0;
        HashSet<Character> set = new HashSet<>();
        int left = 0;

        for (int right = 0; right < n; right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}

// class Solution {
//     public int lengthOfLongestSubstring(String s) {
//         if (s == null || s.isEmpty()) return 0;

//         Map<Character, Integer> map = new HashMap();
//         int ans = 0;
        
//         for (int i = 0, start = 0; i < s.length(); i++) {
//             if (map.containsKey(s.charAt(i))) {
//                 start = Math.max(map.get(s.charAt(i)), start);
//             } 
//             ans = Math.max(ans, ((i+1)-start));
//             map.put(s.charAt(i), i+1);
//         }

//         return ans;
//     }
// }