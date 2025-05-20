class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(String t:tokens){
            if(!"+-*/".contains(t)){
                stack.push(Integer.parseInt(t));
            } else {
                int a=stack.pop();
                int b=stack.pop();
                switch (t){
                    case "+":stack.push(b+a); break;
                    case "-":stack.push(b-a); break;
                    case "*":stack.push(b*a); break;
                    case "/":stack.push((int)(b*1.0/a)); break;
                }
            }
        }
        return stack.pop();
    }
}