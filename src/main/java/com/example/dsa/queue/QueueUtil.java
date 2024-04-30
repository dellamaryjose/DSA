package com.example.dsa.queue;

public class QueueUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Queue <Integer>queue = new Queue<>();
queue.enqueue(2);
queue.enqueue(3);
queue.enqueue(4);
System.out.println(queue);
queue.dequeue();
queue.dequeue();
queue.dequeue();
System.out.println(queue);
	}

}
