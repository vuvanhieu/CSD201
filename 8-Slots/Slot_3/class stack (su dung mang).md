Ten project_1: stack_array
1. Tao class stack
2. Tao class Main

```cpp
public class stack {
    private int top;
    private int arr[];
    private int n;
    
    public stack(int n) {
		top = -1;
		this.n = n;
		arr = new int[this.n];
	}
	
	//them vao
	public void push(int val) {
	   if (isFull()) {
	        System.out.println("Stack Overflow");
	        
	   } esle {
	       top ++;
	       arr[top] = val;
	   }
	}
	
	//lay ra
	public int pop() {
	    if (isEmpty()) {
	        System.out.println("Stack Underflow");
	        return 0;
	   } else {
	       value = arr[top];
	       arr[top] = 0;
	       top --;
	       return value;
	   }
	}
	
	public boolean isFull() {
	    if(top = n-1)
	        return true;
	    else 
	        return false;
	}
	
	public boolean isEmpty() {
	    if(top == -1)
	        return true;
	    else 
	        return false;
	}
	
	void display() {
	    if(isEmpty()){
	        System.out.println("Stack is Empty");
	    } else {
	        System.out.println("All values in Stack:");
	        for (int i = top; i>=0; i--){
	            System.out.println(arr[i]);
	        }
	    }
	    
	                
	}
	
	public int count(){
	    return top+1;
	}
	
	public void updateStack(int pos, int value){
	    if(pos > count()){
	        System.out.println("Stack Overflow");
	    } else {
	        arr[pos -1] = value;
	    }
	    
	}
	
}
```
