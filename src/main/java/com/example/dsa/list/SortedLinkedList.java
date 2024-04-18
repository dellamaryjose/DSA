package com.example.dsa.list;

public class SortedLinkedList<T> extends SinglyLinkedList<T>{
	
	
	public void removeDuplicates() {
		
		if(head==null) {
			
			return;
		}
		
		Node<T> currentNode = head;
		while(currentNode!=null && currentNode.next!=null) {
			
			if(currentNode.element == currentNode.next.element) {
				
				currentNode.next = currentNode.next.next;
				
			}else {
				
				currentNode = currentNode.next;
			}
		}
	}

	public void addItem(Integer element) {
		
		if(head==null) {
			
			head.element = (T) element;
			return;
		}
		
		Node<Integer> current = (Node<Integer>) head;
		Node<Integer> temp = null;
		Node<Integer> newNode = new Node(element);
		
		while(current!=null && current.element < element) {
				temp = current;
				current = current.next;
			}
				temp.next = newNode;
				newNode.next = current;
		
	}
	
	public Node<Integer> addNodes(Node<Integer> a , Node<Integer> b){
		
		Node<Integer> dummy = new Node<Integer>(0);
		Node<Integer> tail=dummy;
		int sum=0;
		int carry=0;
		int rem =0;
		int aVal=0;
		int bVal=0;
		
		while(a!=null || b!=null) {
			System.out.println("Inside Loop");
			aVal = a!=null?a.element:0;
			bVal = b==null?0:b.element;
			sum = aVal+bVal+carry;
			rem = sum%10;
			carry = sum/10;
			System.out.println("Sum="+sum+"--rem="+rem+"--carry="+carry);
			tail.next = new Node<Integer>(rem);
			tail = tail.next;
			if(a!=null) {
				a= a.next;
			}
			if(b!=null) {
				b=b.next;
				}
		}
		if(carry>0) {
		tail.next = new Node<Integer>(rem);
		}
		return dummy.next;
		
	}
	public Node<Integer> mergeList(Node<Integer> a, Node<Integer> b){
		
		Node<Integer> dummy = new Node(0);
		Node<Integer> tail = dummy;
		
		while(a!=null && b!=null) {
			System.out.println("Inside Loop");
			if(a.element<b.element) {
				System.out.println("Inside if");
				tail.next = a;
				a=a.next;
			}
			else {
				System.out.println("Inside else");
				tail.next = b;
				b=b.next;
			}
			tail = tail.next;
		}
		
		if(a==null && b!=null) {
			
			tail.next = b;
		}else if(b==null && a!=null) {
			
			tail.next =a;
		}
		
		return dummy.next;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SortedLinkedList<Integer> sortedList = new SortedLinkedList<>();
		 * System.out.println("Remove duplicates from sorted list ==");
		 * sortedList.insertAt(1, 1); sortedList.insertAt(1, 2); sortedList.insertAt(2,
		 * 3); sortedList.insertAt(2, 4); sortedList.insertAt(5, 5);
		 * sortedList.printList(sortedList); sortedList.removeDuplicates();
		 * sortedList.addItem(4); sortedList.addItem(3);
		 * sortedList.printList(sortedList);
		 */
		SortedLinkedList< Integer> s1 = new SortedLinkedList<>();
		s1.insertLast(3);
		s1.insertLast(2);
		s1.insertLast(8);
		SortedLinkedList< Integer> s2 = new SortedLinkedList<>();
		s2.insertLast(7);
		s2.insertLast(9);
		s2.insertLast(7);
		s2.insertLast(2);
		s1.printList(s1);
		s2.printList(s2);
		SortedLinkedList< Integer> s3 = new SortedLinkedList<>();
		//s3.head = s3.mergeList(s1.head, s2.head);
		s3.head = s3.addNodes(s1.head, s2.head);
		s3.printList(s3);
	}

}
