class MyQueue {

   
 private  Stack<Integer> s1 = new Stack<>();
   private  Stack<Integer> s2 = new Stack<>();
    public MyQueue() {
    }
     
        
    public void push(int x) {
      
        s1.push(x);
        
    }
    
    public int pop() {
       if(s2.isEmpty()){
           shift();
       }
        return s2.pop();
    }
    
    public int peek() {
      if(s2.isEmpty()){
           shift();
      }
        return s2.peek();
    }
    
    public boolean empty() {
          return s1.isEmpty() && s2.isEmpty();
    }
        
        public void shift(){
            while(!s1.isEmpty()){
                int p=s1.pop();
                s2.push(p);
            }
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