
import java.lang.reflect.Constructor;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuvan
 */
public class SinglyLinkedList {
    private Node head;
    private Node tail;
    
//    Constructor
    public SinglyLinkedList(){
        head = null;
        tail = null;
    }
    
    public void addToHead(int x){
        Node newNode = new Node(x);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    
//    danh sach rong
    public void addToTail(int x){
        Node newNode = new Node(x);
        if(tail == null){
            tail = newNode;
            head = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    
//    them vao sau nut p 
    public void addAfter(Node p, int x){
        if(p == null){
            System.out.println("Node p is null so cannot add after!");
        }
        
        Node newNode = new Node(x);
        newNode.next = p.next;
        p.next = newNode;
        
        if(p == tail){
            tail = newNode;
        }
    }
//    Hien thi danh sach
    public void traverse(){
        Node current = head;
        while(current !=null){
            System.out.println(current.data +" ");
            current = current.next;
        }
        System.err.println();
    }
    
    public int deleteFromHead(){
        if(head == null){
            throw new IllegalStateException(" List is empty so cannot delete from head.");
        }
        int detetedValue = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        return detetedValue;
    }
    
    public int deleteFromTail(){
        if(head == null){
           throw new IllegalStateException(" List is empty so cannot delete from tail."); 
        }
        
        int deletedValue;
        if(head == tail){
            deletedValue = head.data;
            head = null;
            tail = null;
        } else {
            Node current = head;
            while(current != null){
                current = current.next;
            }
            deletedValue = tail.data;
            current.next = null;
            tail = null;
        }
        return deletedValue;
    }
    
//    Xoa sau nut p
    public int deleteAfter(Node p){
        if(p == null || p.next == null){
            throw new IllegalArgumentException("Node p is null or does not have a next node");
        }
        int deletedValue = p.next.data;
        p.next = p.next.next;
        
        // kiem tra neu la nut cuoi thi phai xac dinh con tro tail
        if(p.next == null){
            tail = p;
        }
        
        return deletedValue;
    }
    
//    xoa nut co gia tri la x
    public void delete(int x){
//        TH1: neu danh sach rong
        if(head == null){
            System.out.println("List is empty. Cannot delete");
            return;
        }
//        TH2: neu danh sach chi co 1 nut
        if(head.data == x){
            head = head.next;
            if(head == null){
                tail = null;
            }
            return;
        }
//        TH3: xoa nut bat ky danh sach khong rong va co nhieu nut
        Node current = head;
        while(current != null && current.next.data !=x){
            current = current.next;  
        }
        if(current.next != null){
            current.next = current.next.next;
            // giu thong tin cua tail
            if(current.next == null){
                tail = current;
            }
        }
    }
    
    // xoa danh sach
    public void clear(){
        head=tail=null;
   }

    
//    Tim kiem mot nut theo thong tin
    public Node search(int x){
        Node current = head;
        while (current != null) {
            if(current.data == x){
                return current;
            }
            current = current.next;
        }
        // khong ton tai
        return null;
    }
    
//    Dem so phan tu trong danh sach
    public int count(){
        int count =0;
        Node current = head;
        while (current !=null){
            count ++;
            current = current.next;
        }
        return count;
    }
    
//    Xoa nut theo vi tri
    public void deleteLocal(int i){
        if(i<1 || i > count()){
            throw new IllegalArgumentException("Invalid index to delete.");
        }
        if(i == 1){
            //xoa nut head
            head = head.next;
            //kiem tra de giu con tro tail
            if(head == null){
                tail = null;
            }
            // ket thuc chuong trinh
            return;
        }
        // vi tri bat ky
        int currentIndex = 1;
        Node current = head;
        Node previous = null;
        while (currentIndex < i){
            previous = current;
            current = current.next;
            currentIndex++;
        }
        // tim den vi tri can xoa
        if(current != null){
            previous.next = current.next;
            
            //kiem tra thong tin tail
            if(previous.next == null){
                tail = previous;
            }
        }
    }
}
