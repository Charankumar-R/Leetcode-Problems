class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        Map<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');

        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && map.containsKey(c) && stack.peek() == map.get(c)){
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}