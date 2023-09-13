1. Step 1: create project Queue_Array
1.1 Create Class Queue

```cpp
class Queue {
    private int front;
	private int rear;
	private int n;
	private int arr[];
	
	public Queue(int size) {
		this.n = size;
		arr = new int[n];
		front = -1;
		rear = -1;
	}
	
	
	public boolean isEmpty() {
		return (rear == -1 && front == -1);
	}
	
	public boolean isFull() {
		return (rear == n - 1);
	}

    public int count() {
	    return rear - front + 1;
	}
	
}
```
