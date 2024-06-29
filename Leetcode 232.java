class MyQueue {
    Stack<Integer> mainSt;
    public MyQueue() {
        mainSt = new Stack<>();
    }
    
    public void push(int x) {
        if (mainSt.size() == 0) {
            mainSt.push(x);
        } else {
            Stack<Integer> tempSt = new Stack<>();
            while(mainSt.size() > 0) {
                tempSt.push(mainSt.pop());
            }

            mainSt.push(x);

            while(tempSt.size() > 0) {
                mainSt.push(tempSt.pop());
            }
        }
    }
    
    public int pop() {
        return mainSt.pop();
    }
    
    public int peek() {
        return mainSt.peek();
    }
    
    public boolean empty() {    
        return mainSt.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
