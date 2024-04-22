package com.example.dsa.list;

import com.example.dsa.list.CircularilyLinkedList.Node;

public class CLUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularilyLinkedList< Integer> cl = new CircularilyLinkedList<>();
		Node<Integer> node1 = new Node<>(2);
		/*
		 * Node<Integer> node2 = new Node<>(10); Node<Integer> node3 = new Node<>(5);
		 * Node<Integer> node4 = new Node<>(8); node1.next = node2; node2.next=node3;
		 * node3.next=node4; node4.next=node1;
		 */
		/*
		 * cl.last=node1; cl.last.next=node1;
		 */
		//System.out.println(cl.length);
		//cl.insertFisrt(2);
		System.out.println(cl);
		//cl.insertFisrt(15);
		//cl.insertFisrt(3);
		cl.insertEnd(3);
		System.out.println(cl);
		cl.insertEnd(10);
		System.out.println(cl);
		//cl.removeFisrt();
		//System.out.println("Fisrt"+cl);
		//cl.removeFisrt();
		cl.removeLast();
		System.out.println("=="+cl);
		cl.removeLast();
		System.out.println("=="+cl);
	}

}
