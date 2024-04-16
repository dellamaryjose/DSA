package com.example.dsa;



public class SingleLinkedList<T> {
Node<T> head;	


class	Node<T>{
	
	T element;
	Node<T> next;
	
	public Node(T elem){
		
		this.element = elem;
		next=null;
	}

	@Override
	public String toString() {
		String elem=element==null?"":element+"";
		String nextVal = next==null?"":next+"";
		String val= elem + "," + nextVal ;
		System.out.println("Val-=");
		return  val;
	}

	
	
}
	public  void add (T element){
		Node<T> newNode = new Node<T>(element);
		Node<T> currentNode =null;
		
		if(head==null) {
			System.out.println("null");
			head = newNode;
			return;
		}
		currentNode = head;
		while(currentNode.next!=null) {
			
			currentNode = currentNode.next;
		}
		System.out.println("next");
		currentNode.next = newNode;
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingleLinkedList<Integer> sl = new SingleLinkedList<>();
		sl.add(1);
		sl.add(6);
		sl.add(4);
System.out.println(sl);
	}





	@Override
	public String toString() {
		
		return head==null?"":head+"";
				
	}
	
	

}
