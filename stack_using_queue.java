class MyStack {
    Queue<Integer> input , output;

    public MyStack() {
        input = new LinkedList<>();
        output = new LinkedList<>();
    }
    
    public void push(int x) {
        //input -> output
        while(input.isEmpty() == false)
        {
            output.offer(input.poll());
        }
        input.offer(x);
        //output -> input
        while(output.isEmpty() == false)
        {
            input.offer(output.poll());
        }
    }
    
    public int pop() {
        int val = input.peek();
        input.poll();
        return val;
    }
    
    public int top() {
        return input.peek();
    }
    
    public boolean empty() {
        return input.isEmpty();
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