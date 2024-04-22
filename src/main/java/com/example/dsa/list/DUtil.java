package com.example.dsa.list;

import com.example.dsa.list.DoublyLinkedList.Node;

public class DUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
DoublyLinkedList<Integer> dl = new DoublyLinkedList<>();
Node<Integer> node1 = new Node<Integer>(2);
Node<Integer> node2 = new Node<Integer>(4);
Node<Integer> node3 = new Node<Integer>(8);
/*
 * dl.head = node1; dl.head.next = node2; node2.next = node3; dl.tail = node3;
 * System.out.println(dl);
 */
//dl.insertFirst(1);
//System.out.println(dl);
dl.insertLast(6);
dl.insertLast(2);
System.out.println(dl);

//dl.deleteFirst();
dl.deleteLast();
System.out.println(dl);
dl.deleteLast();
dl.deleteLast();
System.out.println(dl);
	}

}
