package com.example.dsa.sort;

import java.util.stream.IntStream;

import com.example.dsa.search.BinarySearch;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {4,6,2,1,5,3};

		InsertionSort is = new InsertionSort();

		int[] newArray= is.insertionSort(array);
		IntStream.range(0, newArray.length).forEach(i->System.out.print(newArray[i]+"--"));
	}

	
	public int[] insertionSort(int[] array) {
		
		for(int i=1;i<array.length;i++) {
			
			
			int j= i-1;
			int temp = array[j+1];
			System.out.println("Array[j]"+array[j]+"  Array[j+1]--"+array[j+1]);
			while(j>=0 && array[j]> temp) {
				System.out.println("Array j"+array[j]+" "+" J+1--"+array[j+1]);
				
				array[j+1] = array[j];
				j= j-1;
				
			}
			System.out.println("temp--"+temp+"--j+1="+(j+1));
			array[j+1] = temp;
		}
		
		
		return array;
	}
}
