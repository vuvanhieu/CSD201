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
public class Main {
  
    puclic static void main(String[] args){
        SingleList list = new SingleList();
        
        // add Node
        list.addToHead("Nam");
        list.addToTail("Nu");
        
        list.traverse();
    }
}
