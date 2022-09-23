class MyStack {
    
    LinkedList stack = new LinkedList();
    
    public MyStack() {
        stack = this.stack;       
    }
    
    public void push(int x) {
        stack.add(x);
    }
    
    public int pop() {
        return (int) stack.removeLast();
    }
    
    public int top() {
        return (int) stack.getLast();
    }
    
    public boolean empty() {
        return stack.isEmpty();
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