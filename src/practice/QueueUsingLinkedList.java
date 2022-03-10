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
public class QueueUsingLinkedList {
    static Node node = new Node(1);
    public static void main(String[] args)
    {
        
        QueueUsingLinkedList q = new QueueUsingLinkedList();
        for(int i=2;i<7;i++)
        {
            Node node1 = new Node(i);
            QueueUsingLinkedList.add(node1);
        }        
        QueueUsingLinkedList.remove();
        QueueUsingLinkedList.print();
        QueueUsingLinkedList.remove();
        QueueUsingLinkedList.print();
        QueueUsingLinkedList.remove();
        QueueUsingLinkedList.print();
        QueueUsingLinkedList.remove();
        QueueUsingLinkedList.print();
        QueueUsingLinkedList.remove();
        QueueUsingLinkedList.print();
        QueueUsingLinkedList.remove();
        QueueUsingLinkedList.print();
        QueueUsingLinkedList.remove();
        QueueUsingLinkedList.print();        
    }
    
    public static void add(Node node1)
    {    
        Node temp = node;
        while( temp!=null && temp.next!=null)
        {
            temp=temp.next;
            //System.out.println(temp.data);
        }
        temp.next=node1;
    }
    
    public static void remove()
    {
        Node temp = node;
        /*while( temp!=null && temp.next!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;            
        }*/
        if(node==null)
        {
            System.out.println("Queue is already empty");
        }
        else if(node.next==null)
        {
            node=null;
        }
        else
        {
            node = node.next;
        }        
    }
    
    public static void print()
    {
        while(node!=null )
        {
            System.out.println(node.data);
            node = node.next;
        }
    }
            
    
}
