/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlelinklist;

/**
 *
 * @author vuvan
 */
public class SingleList {
    private Node head;
    private Node tail;
    
    //constructor
    public SingleList(){
        head = null;
        tail = null;
    }
    
    
    public void addToHead(String data){
        Node newNode = new Node(data);
        //Case 1: check head and tail
        if (head == null){
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }
    
    public void addToTail(String data){
        Node newNode = new Node(data);
        //check tail
        if(tail == null){
            tail = head = newNode;
        } else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    
    // Display list
    public void traverse(){
        Node current = head;
        while(current !=null){
            System.out.println(current.data +" ");
            current = current.next;
        }
        System.out.println();
    }
}
