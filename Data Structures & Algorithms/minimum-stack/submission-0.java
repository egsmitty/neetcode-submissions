class MinStack {

    ArrayList<Integer> arr = new ArrayList<>();

    public MinStack() {
        this.arr = arr;
    }
    
    public void push(int val) {
        arr.addFirst(val);
    }
    
    public void pop() {
        arr.remove(arr.get(0));
    }
    
    public int top() {
        return arr.get(0);
    }
    
    public int getMin() {
        return Collections.min(arr);
    }
}
