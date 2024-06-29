class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        Queue<Integer> tempQ = new LinkedList<>();
        while(q.size() > 0) {
            tempQ.add(q.poll());
        }

        q.add(x);

        while(tempQ.size() > 0) {
            q.add(tempQ.poll());
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        if(q.size() == 0) return true;
        return false;
    }
}
