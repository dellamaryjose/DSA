package com.example.dsa.arrays;

import java.util.stream.IntStream;

public class MoveZeros {

	public static void main(String[] args) {
		//move 0s to last of the array and maintain the array order for non zero elements
int[] array = {8,1,0,2,1,0,3};
int newArray [] = move(array, array.length);
IntStream.range(0, array.length).forEach(i-> System.out.print(newArray[i]));

	}

	
	public static int[] move(int array[],int size) {
		
		int j=0;
		for(int i=0;i<size;i++) {
			
			if(array[i]!=0 && array[j]==0) {
				int temp = array[i];
				array[i]=array[j];
				array[j] = temp;
				
			}
			
			if(array[j]!=0) {
			j++;	
				
			}
			
		}
		return array;
	}
}
