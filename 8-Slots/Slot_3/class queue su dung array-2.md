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
	
	public void enqueue(int val){
	    if (isFull()) {
			System.out.println("Queue  is Full");
			return;
		} else if(front == -1){
		    front = rear = 0;
		}
		else {
		    rear ++ ;
		}
		arr[rear] = val;
	}
	
	public int dequeue(){
	    int  value = 0;
	    if(isEmpty()){
	        System.out.println("Queue is Empty");
	        return  -10000;
	    } else if (rear == front){
	        value = arr[front];
	        front = rear = -1;
	        return value;
	    } else {
	        value = arr[front];
	        front ++;
	        return value
	    }
	}
	
}
```
