package com.example.dsa.priorityQueue;

public class PriorityQueueUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PriorityQueue pq = new PriorityQueue(3);
pq.insert(4);
pq.insert(5);
pq.insert(2);
pq.insert(9);
System.out.println("Size"+pq.size);
pq.display();
pq.deleteMax();
pq.deleteMax();
System.out.println("After deletion");
pq.display();
	}

}
