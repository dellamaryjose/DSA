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
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SortedLinkedList<Integer>  sortedList = new SortedLinkedList<>();
		System.out.println("Remove duplicates from sorted list ==");
		sortedList.insertAt(1, 1);
		sortedList.insertAt(1, 2);
		sortedList.insertAt(2, 3);
		sortedList.insertAt(2, 4);
		sortedList.insertAt(5, 5);
		sortedList.printList(sortedList);
		sortedList.removeDuplicates();
		sortedList.addItem(4);
		sortedList.addItem(3);
		sortedList.printList(sortedList);
	}

}
