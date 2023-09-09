/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vuvan
 */
public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        //them cac nut vao danh sach
        list.addToHead(1);
        list.addToTail(2);
        list.addToTail(3);
        list.addToHead(0);
        
        // hien thi danh sach
        list.traverse();
        
        // them vao sau nut p
        Node p = list.search(0);
//        list.addAfter(p, 10);
        
        // hien thi danh sach
        list.traverse();
        
        //xoa danh sach
        list.clear();
        
//        list.addToHead(10);
//        list.addToTail(20);
        // hien thi danh sach
        
        list.traverse();
        
    }
}
