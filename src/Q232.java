import java.util.Stack;

public class Q232 {
    Stack<Integer> stack;
    public Q232() {
        this.stack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        Stack<Integer> temp = new Stack<>();
        while(!stack.isEmpty()) temp.push(stack.pop());
        stack.push(x);
        while(!temp.isEmpty()) stack.push(temp.pop());
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        return stack.pop();
    }

    /** Get the front element. */
    public int peek() {
        return stack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
