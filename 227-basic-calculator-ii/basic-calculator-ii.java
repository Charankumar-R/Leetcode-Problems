class Solution {
    public int calculate(String s) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        int number = 0;
        char lastOperator = '+';

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                number = number * 10 + (c - '0');
            }

            if (c == '(') {
                int j = i, braces = 1;
                while (braces > 0) {
                    j++;
                    if (s.charAt(j) == '(') braces++;
                    if (s.charAt(j) == ')') braces--;
                }
                number = calculate(s.substring(i + 1, j));
                i = j; // Move the index to the end of the parenthesis
            }

            if (!Character.isDigit(c) && c != ' ' || i == s.length() - 1) {
                switch (lastOperator) {
                    case '+': stack.push(number); break;
                    case '-': stack.push(-number); break;
                    case '*': stack.push(stack.pop() * number); break;
                    case '/':
                        if (number == 0) throw new ArithmeticException("Division by zero");
                        stack.push(stack.pop() / number); break;
                }
                lastOperator = c;
                number = 0;
            }
        }

        int result = 0;
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }
}