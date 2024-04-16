package com.example.dsa.arrays;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayOperations {

	
	public static void  main(String a[]) {
		
		int[] array = createArray();
		//deleteElement(4, array);
		System.out.println(search(array,6));
		//Arrays.stream(array).forEach(System.out::println);
		
	}
	
	
	public static int[] createArray() {
		int[] array = new int[5];
		
		for(int i=0;i<5;i++) {
			array[i] =i*2;
			
		}
		
		return array;
	}
	
	public static void deleteElement(int element , int[] array) {
		
		for(int i=0;i<5;i++) {
			
			if(array[i]==element) {
				array[i] = 0;
			}
		}
		AtomicInteger increment = new AtomicInteger();
		Arrays.stream(array).forEach(i->{
			
			System.out.println(increment.get()+"::"+array[increment.get()]);
		increment.getAndIncrement();
		});
	}
	
	
	public static int search(int [] array, int element) {
AtomicInteger index = new AtomicInteger();
AtomicBoolean flag = new AtomicBoolean();
flag.set(false);
		Arrays.stream(array).forEach(i->{
			
			if(i==element) {
				flag.set(true);
			}
		System.out.println("Index--"+index.get());	
		if(!flag.get())
		index.getAndIncrement();
		});
		return index.get();
	}
}
