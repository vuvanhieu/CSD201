# 1. Tao class stack (su dung mang)
```cpp
class stack{
    private int top;
    private arr[];
    private int n;
    
    public stack(int n){
        top = -1;
        this.n = n;
        arr = new int[this.n];
    }
    
    public void push(int val){
        if(isFull()){
            Systen.out.println("Stack Overflow");
        } else {
            top++;
            arr[top] = val;
        }
    }
    
    public int pop(){
        if(isEmpty()){
            Systen.out.println("Stack Underflow");
            return 0;
        } else {
            int popValue = arr[top];
            arr[top] = 0;
            top--
            return popValue;
        }
    }
    
    public int count(){
        return (top+1);
    }
    
    // xem phan tu tren cung
    public int Top(){
        if(isEmpty()){
            System.out.println("Stack Underflow");
            return 0;
        }
        return arr[top];
    }
    
    // xem cac phan tu trong stack
    void display(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        } else {
            System.out.println("All value in the Stack are:");
            for( int i = top; i>=0; i--){
                System.out.println(arr[i]);
            }
        }
    }
    
    public boolean isFull(){
        if(top == n-1){
            return true;
        } else
            return false;
    }
    
    public boolean isEmpty(){
        if(top == -1){
            return true;
        } else
            return false;
    }
    
}
```
