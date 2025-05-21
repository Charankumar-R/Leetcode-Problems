import java.util.*;

class MyStack {
    private Deque<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }
    
    public void push(int x) {
        queue.addLast(x);
    }
    
    public int pop() {
        int size = queue.size();
        for(int i=0; i<size-1; i++){
            queue.addLast(queue.removeFirst());
        }
        return queue.removeFirst();
    }
    
    public int top() {
        return ((LinkedList<Integer>) queue).getLast();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */