/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.project;

/**
 *
 * @author ahmet
 */
public class LinkedList <T> {
    private Node <T> head;
    
    public void addFirst(Node newNode){
        if(head==null){
            head=newNode;
        }else{
            newNode.next=head;
            head=newNode;
        }
    }
}
