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

// Java program for reversing the linked list
import java.util.*;
class LinkedList {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Function to reverse the linked list */
	Node reverse(Node node)
	{
		if(node==null || node.next==null)
                {
                    return node;
                }
                System.out.println("node = "+node.data);
                System.out.println("node = "+node.next.data);                
                Node res = reverse(node.next);
                System.out.println("res = "+res.data);
                System.out.println("node = "+node.data);
                System.out.println("node.ext = "+node.next.data);            
                node.next.next=node;
                node.next=null;
                HashSet<String> set = new HashSet<>();
                set.add("Deepa");
                return res;
	}

	// prints content of double linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver Code
	public static void main(String[] args)
	{
		LinkedList list = new LinkedList();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);

		System.out.println("Given Linked list");
		list.printList(head);
		head = list.reverse(head);
		System.out.println("");
		System.out.println("Reversed linked list ");
		list.printList(head);
	}
}

// This code has been contributed by Mayank Jaiswal
