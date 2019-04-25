import java.util.Stack;

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
public class Q155 {
    /** initialize your data structure here. */
    private Stack stack;
    private int min;
    public Q155() {
        this.stack = new Stack();
        this.min = Integer.MAX_VALUE;
    }

    public void push(int x) {

        if (x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if ((int) stack.pop() == min) min = (int) stack.pop();
    }

    public int top() {
        return (int) stack.peek();
    }

    public int getMin() {
        return min;
    }
}
