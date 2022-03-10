/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author jmd
 */
public class DequeUsingLinkedList {
    static Node head = new Node(1);
    static Node tail = head.next;
    public static void main(String[] args)
    {
        for(int i=2;i<7;i++)
        {
            Node node1 = new Node(i);
            DequeUsingLinkedList.addbeg(node1);
            Node node2 = new Node(i+25);
            //DequeUsingLinkedList.addlast(node2);
        } 
        DequeUsingLinkedList.print();
        //DequeUsingLinkedList.removelast();
        //DequeUsingLinkedList.removelast();
        //DequeUsingLinkedList.removelast();
        //DequeUsingLinkedList.removelast();
        DequeUsingLinkedList.removebeg();
        DequeUsingLinkedList.removebeg();
        DequeUsingLinkedList.removebeg();
        DequeUsingLinkedList.print();
    }
    
    public static void addbeg(Node node)
    {
        Node temp = head;
        node.next=temp;
        head=node;
    }
    
    public static void addlast(Node node)
    {
        Node temp = head;
        while(temp!=null && temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=node;
        tail=node;
    }
    public static void print()
    {
        Node temp = head;
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    
    public static void removebeg()
    {
        head = head.next;
    }
    
    public static void removelast()
    {       
        if(head==null)
        {
            System.out.println("Already empty dequeue");
        }
        else{
            Node temp = head;
            while(temp.next!=tail)
            {
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }
    
}
