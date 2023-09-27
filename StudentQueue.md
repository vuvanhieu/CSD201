```cpp
class Student {
    String studentCode;
    String fullName;
    String dateOfBirth;
    String address;
    String classCode;

    Student() {}

    Student(String code, String name, String dob, String addr, String classCode) {
        studentCode = code;
        fullName = name;
        dateOfBirth = dob;
        address = addr;
        this.classCode = classCode;
    }

    public String toString() {
        return "(" + studentCode + ", " + fullName + ", " + dateOfBirth + ", " + address + ", " + classCode + ") ";
    }
}

class Node {
    Student info;
    Node next;

    Node() {}

    Node(Student x, Node q) {
        info = x;
        next = q;
    }

    Node(Student x) {
        this(x, null);
    }
}

class StudentQueue {
    private Node front; // Front of the queue
    private Node rear;  // Rear of the queue

    public StudentQueue() {
        front = rear = null;
    }

    // Enqueue (add) a student to the queue
    public void enqueue(Student student) {
        Node newNode = new Node(student);
        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    // Dequeue (remove) a student from the front of the queue
    public Student dequeue() {
        if (isEmpty()) {
            return null; // Queue is empty
        }
        Student student = front.info;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return student;
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Get the size of the queue
    public int size() {
        int count = 0;
        Node current = front;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    // View the student at the front of the queue without removing it
    public Student peek() {
        return isEmpty() ? null : front.info;
    }
}

public class Main {
    public static void main(String[] args) {
        StudentQueue studentQueue = new StudentQueue();

        // Enqueue (add) some students to the queue
        studentQueue.enqueue(new Student("1", "Alice", "1990-01-01", "123 Main St", "ClassA"));
        studentQueue.enqueue(new Student("2", "Bob", "1995-03-15", "456 Elm St", "ClassB"));
        studentQueue.enqueue(new Student("3", "Charlie", "1992-07-20", "789 Oak St", "ClassC"));

        // Dequeue (remove) students from the front of the queue
        System.out.println("Dequeueing students from the queue:");
        while (!studentQueue.isEmpty()) {
            Student student = studentQueue.dequeue();
            System.out.println("Dequeued: " + student);
        }
    }
}
```
