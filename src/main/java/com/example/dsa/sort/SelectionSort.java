package com.example.dsa.sort;

import java.util.stream.IntStream;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {4,6,2,1,5,3};

		SelectionSort is = new SelectionSort();

		int[] newArray= is.selectionSort(array);
		IntStream.range(0, newArray.length).forEach(i->System.out.print(newArray[i]+"--"));
	}

	
	public int[] selectionSort(int[] array) {
	
		for(int i=0;i<array.length-1;i++) {
			
			int min=i;
			
			for(int j=i+1;j<array.length;j++) {
				
				if(array[min]>array[j]) {
					
					min=j;
				}
				
			}
			
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		
		return array;
	}
}
