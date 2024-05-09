package com.example.dsa.priorityQueue;

import java.util.stream.IntStream;

public class PriorityQueue {

	Integer[] array;
	int size;

	
	public PriorityQueue(int capacity) {
		
		size = 0;
		array = new Integer[capacity+1];
	}
	public void insert(int key) {
	if(array.length==size+1) {
	resize(2*size);
	}
	size++;
	array[size] = key;
	swim(key,size);
	}
	
	
	public void swim(int key,int k) {
		
		while(k!=1 && array[k/2]<array[k]) {
			
			int temp = array[k/2];
			array[k/2] = array[k];
			array[k]=temp;
			k= k/2;
		}
		
	}
	public void resize(int capacity) {
		System.out.println("Resize--");
		Integer[] newArray = new Integer[capacity];
		
		IntStream.range(1, array.length).forEach(i->{
			
			newArray[i] = array[i];
					
		});
		
		array = newArray;
	}
	
	public int deleteMax() {
		int max = array[1];
		swap(1,size);
		array[size]=null;
		size--;
		topDownSwin(1);
		if(size>0 && (size==(array.length-1)/4)) {
		resize(array.length/2);	
			
		}
	
		return max;
		
	}
	public void topDownSwin(int key) {
		int j = key*2;
		
		while(2*key<=size) {
			
			if(j<size && array[j]<array[j+1]) {
				
				j++;
			}
			
			if(array[key]>=array[j]) {
				
				break;
			}
			
			swap(key,j);
			key = j;
		}
		
		
	}
	public void swap(int a, int b) {
		
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	public void display() {
		
		
		if(array.length>0) {
			
		IntStream.range(1, size+1).forEach(i->System.out.println(array[i]));	
		}
		
	}
}
