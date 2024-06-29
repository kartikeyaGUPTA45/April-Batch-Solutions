class Pair {
    int ele;
    int min;

    public Pair(int ele, int min) {
        this.ele = ele;
        this.min = min;
    }
}

class MinStack {
    Stack<Pair> st;
    public MinStack() {
        st = new Stack<>();
    }
    
    public void push(int val) {
        if (st.size() == 0) {
            st.push(new Pair(val,val));
        } else {
            int min = st.peek().min;
            min = Math.min(min,val);
            st.push(new Pair(val,min));
        }
    }
    
    public void pop() {
        st.pop();
    }
    
    public int top() {
        return st.peek().ele;
    }
    
    public int getMin() {
        return st.peek().min;
    }
}
