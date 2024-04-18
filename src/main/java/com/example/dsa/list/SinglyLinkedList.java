package com.example.dsa.list;

public class SinglyLinkedList<T> {
	Node <T> head; 
	
	public static class Node<T>{
		
	T element;
	Node<T> next ;
	
	public Node(T elem) {
		
		this.element = elem;
		next =null;
		
	}
	}
	
	public void printList(SinglyLinkedList<T> list) {
		
		Node<T> currentNode = list.head;
		System.out.println();
		while(currentNode!=null) {
			
		System.out.print(currentNode.element+"-->");
		currentNode = currentNode.next;
		}
		System.out.println();
	}
	
	public int size(SinglyLinkedList<T> list) {
		
		int length = 0;
		Node<T> current = list.head;
		while(current!=null) {
			length ++;
			current = current.next;
		}
		return length;
	}
	
	public void insertFirst(T element) {
		
		Node<T> newNode = new Node<T>(element);
		newNode.next = head;
		head = newNode;
	}
 public void insertLast(T element) {
	 Node<T> newNode = new Node<T>(element);
	 if(head==null) {
		 
		head=newNode ;
		return;
	 }
	 
	 Node<T> currentNode = head;
	 while(currentNode.next!=null) {
		 
		currentNode = currentNode.next; 
		
	 }

	 currentNode.next=newNode;
 }
 public Node<T> deleteFirst(){
	 
	 if(head==null) {
		 
		 return null;
	 }
	 
	 Node<T> currentNode = head;
	 head = head.next;
	 currentNode.next =null;
	 return currentNode;
	 
 }
 
 public Node<T> deleteLast(){
	 
	 if(head==null || head.next ==null) {
		 
		 return head;
	 }
	 
	 Node<T> currentNode = head;
	 Node<T> prevNode = null;
	 
	 while(currentNode.next!=null) {
		 prevNode = currentNode;
		 currentNode = currentNode.next;
		 
	 }
	 
	 prevNode.next = null;
	 return currentNode;
 }
 
 public SinglyLinkedList<T> reverseList() {
	 
	 Node<T> current = head;
	 Node<T> previous = null;
	 Node<T> next = null;
	 SinglyLinkedList< T > newList = new SinglyLinkedList<T>();
	 if(head==null) {
		 newList.head =head;
		return newList; 
	 }
	 while(current!=null) {
		 
		 next = current.next;
		 current.next=previous;
		 previous = current;
		 current = next;
		 
	 }
	 newList.head = previous;
	 return newList;
 }
 
 public Node<T> deleteAt(int position){
	 Node<T> temp=null;
	 if(position==1) {
		temp=head; 
		head = head.next; 
		temp.next=null;
		return temp;
	 }
	 else {
		int count =1;
		Node<T> prevNode = head;
		
		while(count<position-1) {
			
			prevNode = prevNode.next;
		}
		 
		 
		 temp=prevNode.next;
		 prevNode.next=temp.next;
		 temp.next=null;
		 return temp;
	 }
 }
 
 public boolean search(T element) {
	 
	 boolean flag = false;
	 Node<T> current = head;
	 while(current!=null) {
		 if(current.element==element) {
			 
			 flag= true;
			 return flag;
		 }
		 current = current.next;
	 }
	 
	 return flag;
	 
 }
 public void insertAt(T element , int position) {
	 
	 Node<T> newNode = new Node<T>(element);
	 if(position==1) {
		newNode.next = head;
		head = newNode; 
		return;
	 }
	 
	 int count =1;
	 Node<T> previousNode = head;
	 while(count<position-1) {
		 
		 previousNode = previousNode.next;
		 count++;	 
	 }
	 Node<T> currentNode = previousNode.next;
	 newNode.next = currentNode;
	 previousNode.next = newNode;
 }
 
 public T findNElementFromLast(int position) {
	 
	 Node<T> first = head;
	 Node<T> second = head;
	 int count=0;
	 while(count<position) {
		 
		 first = first.next;
		 count++;
	 }
	 
	 while(first!=null) {
		 
		 first = first.next;
		 second = second.next;
	 }
	 
	 return second.element;
 }
 
 public void removeDuplicatesFromSortedList(){
	  
	 if(head==null) {
		 
		 return;
	 }
	 Node<T> current = head;
	 
	 while(current!=null && current.next !=null) {
		 
		if(current.element==current.next.element) {
			current.next = current.next.next;
		} else {
			
			current= current.next;
		}
	 }
	 
 }
 
 public void removeKey(int key) {
	 
	 Node<Integer> current = (Node<Integer>) head;
	 Node<Integer> temp = null;
	 
	 if(current==null) {
	return;
	 }
	while(current!=null && current.element!=key) {
		
		temp = current;
		current = current.next;
	} 
	
	temp.next = current.next;
	
 }
 
 public boolean isloop() {
	boolean flag = false;
	
	Node<T> fastPtr = head;
	Node<T> slowPtr = head;
	while(fastPtr!=null && fastPtr.next!=null) {
		fastPtr = fastPtr.next.next;
		slowPtr = slowPtr.next;
		if(fastPtr== slowPtr) {
			
			flag = true;
			return flag;
		}
	}
	

	
	return flag;
	 
	 
 }
 
 public int startOfLoop() {
	int start =0;
	
	Node<Integer> fastPtr = (Node<Integer>) head;
	Node<Integer> slowPtr = (Node<Integer>)head;
	
	while(fastPtr!=null && fastPtr.next!=null) {
		fastPtr = fastPtr.next.next;
		slowPtr = slowPtr.next;
		
		if(fastPtr==slowPtr) {
			start = findStart(slowPtr);
			return start;
		}
	}
	
	return start;
	 
	 
 }
 
 public int findStart(Node<Integer> slowPtr) {
	 
	 int start =0;
	 Node<Integer> current = (Node<Integer>)head;
	 while(current!=null) {
		 
		 current = current.next;
		 slowPtr = slowPtr.next;
		 if(current==slowPtr) {
			 
			start = current.element;
			return start;
		 }
	 }
	 
	 return start;
	 
 }
 
 public void removeLoop() {
	 
	Node<Integer> fastPtr =(Node<Integer>) head;
	Node<Integer> slowPtr =(Node<Integer>) head;
	
	while(fastPtr!=null && fastPtr.next!=null) {
		fastPtr = fastPtr.next.next;
		slowPtr = slowPtr.next;
		
		if(fastPtr==slowPtr) {
			System.out.println("Inside equals--");
			remove(slowPtr);
			return;
		}
		
	}
	
	 
 }
 
 
 public void remove(Node<Integer> slowPtr) {
	 System.out.println("Inside Remove--");
	 Node<Integer> temp = (Node<Integer>) head;
	 
	 while(slowPtr.next!=temp.next) {
		 slowPtr = slowPtr.next;
		 temp = temp.next;
	 }
	  slowPtr.next = null;
 }
 
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<Integer>();
		Node<Integer> head = new Node<Integer>(10);
		Node<Integer> secondNode = new Node<Integer>(2);
		Node<Integer> thirdNode = new Node<Integer>(8);
		Node<Integer> fourthNode = new Node<Integer>(15);
		head.next = secondNode;
		secondNode.next = thirdNode;
		thirdNode.next = fourthNode;
		singlyLinkedList.head = head;
		singlyLinkedList.insertFirst(20);
		singlyLinkedList.insertLast(30);
		singlyLinkedList.insertAt(5, 4);
		singlyLinkedList.printList(singlyLinkedList);
		//System.out.println("Length -->"+singlyLinkedList.size(singlyLinkedList));
		//System.out.println("DeleteFirst-->"+singlyLinkedList.deleteFirst().element);
		//System.out.println("DeleteLast-->"+singlyLinkedList.deleteLast().element);
		//System.out.println("DeleteLast-->"+singlyLinkedList.deleteAt(2).element);
		//singlyLinkedList.printList(singlyLinkedList);
		//System.out.println("Length -->"+singlyLinkedList.size(singlyLinkedList));
		//System.out.println("Search Result =="+singlyLinkedList.search(10));
		//singlyLinkedList.printList(singlyLinkedList.reverseList());
		//System.out.println("Nth element from last -->"+singlyLinkedList.findNElementFromLast(2));
		singlyLinkedList.removeKey(5);
		singlyLinkedList.printList(singlyLinkedList);
		
		SinglyLinkedList<Integer> newList = new SinglyLinkedList<>();
		Node<Integer> node1 = new Node<Integer>(1);
		Node<Integer> node2 = new Node<Integer>(2);
		Node<Integer> node3 = new Node<Integer>(3);
		Node<Integer> node4 = new Node<Integer>(4);
		Node<Integer> node5 = new Node<Integer>(5);
		Node<Integer> node6 = new Node<Integer>(6);
		newList.head = node1;
		newList.head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next=node5;
		node5.next = node6;
		node6.next =node3;
		System.out.println(newList.isloop());
		//System.out.println("STRAT--"+newList.startOfLoop());
		newList.removeLoop();
		//newList.printList(newList);
		System.out.println("--"+newList.isloop());
		newList.printList(newList);
	
	}

}
