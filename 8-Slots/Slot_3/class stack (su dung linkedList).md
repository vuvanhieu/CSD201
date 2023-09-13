## Tao stack su dung luu tru bang danh sach
```cpp
class stack_LL {

    class Node {
    	private int data;
    	private Node next;
    
    	public Node(int data) {
    	this.data = data;
    	next = null;
    	}
    }
    
    private Node top;
    private int size;
	
	public stack_LL(){
	    top = null;
	    size = 0;
	}
	
	public void push(int val){
	    Node n = new Node(val);
	    n.next = top;
	    top = n;
	    size++;
	}
	
	
	public int pop(){
	    if(isEmpty()){
	        System.out.println(x:"Stack Underflow");
	        return -9999;
	    }
	    int value = top.data;
	    top = top.next;
	    size--
	    return value;
	}
	
	public void display() {
	    Node t = top;
	    if(isEmpty){
	        System.out.println(x:"Stack is Empty");
	        return;
	    }
	    while(t!= null){
	        System.out.println(t.data);
	        t = t.next;
	    }
	}
	pulic int size(){
	    return size;
	}
}
```
