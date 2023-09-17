```cpp
public class Person{
    String name; int age;
    Person() {}
    Person(String xName, int xAge) {
        name=xName;age=xAge;
    }
    public String toString() {
        return("("+name+", " + age+") ");
    }
 }
 
 public class Node{
    Person info;
    Node next;
    Node() {}   
    Node(Person x, Node q) {info=x;next=q;}
    Node(Person x) {this(x,null);} 
 }

public class MyList
 {Node head, tail;
   MyList() {head=tail=null;}
   boolean isEmpty() {return(head==null);}
   void clear() {head=tail=null;}

   // (1) 
   void addLast(Person x)
     {Node q = new Node(x);
       if(isEmpty()) {head=tail=q;return;}
       tail.next = q;
       tail = q;
     }

    void visit(Node p) {if(p!=null) System.out.print(p.info);}
    void traverse()
     {Node p=head;
       while(p!=null)
         {visit(p);
           p=p.next;
         }
      System.out.println();
     }
   void addMany(String [] a, int [] b)
     {int n,i; n=a.length;
       for(i=0;i<n;i++) addLast(new Person(a[i],b[i]));
     }

   // (2)
   Node searchByName(String xName)
     {Node p=head;
       while(p!=null)
        {if(p.info.name.equals(xName)) return(p);
          p=p.next;
        }
       return(null);
     }

   // (3) Add a Person as the first node in the list
    void addFirst(Person x) {
        Node q = new Node(x);
        if (isEmpty()) {
            head = tail = q;
        } else {
            q.next = head;
            head = q;
        }
    }

    // (4) Insert a Person after a specified node q
    void insertAfter(Node q, Person x) {
        if (q == null) {
            System.out.println("Cannot insert after a null node.");
            return;
        }

        Node newNode = new Node(x);
        newNode.next = q.next;
        q.next = newNode;

        // If q is the tail node, update the tail to the new node
        if (q == tail) {
            tail = newNode;
        }
    }

    // (5) Insert a Person before a specified node q
    void insertBefore(Node q, Person x) {
        if (q == null) {
            System.out.println("Cannot insert before a null node.");
            return;
        }

        Node newNode = new Node(x);

        // If q is the head node, update the head to the new node
        if (q == head) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Find the node before q
        Node p = head;
        while (p != null && p.next != q) {
            p = p.next;
        }

        if (p == null) {
            System.out.println("Node not found in the list.");
        } else {
            newNode.next = p.next;
            p.next = newNode;
        }
    }

 }

```
