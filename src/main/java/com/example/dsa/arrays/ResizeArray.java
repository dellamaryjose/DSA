package com.example.dsa.arrays;

public class ResizeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {3,2,1,4};
		int newArray[] = resize(array, array.length);
		System.out.print(newArray.length);

	}
public static int[] resize(int array[], int capacity) {
	
	int [] temp = new int[2*capacity];
	
	for(int i=0;i<array.length;i++) {
		
		temp[i] = array[i];
		
	}
	
	array = temp;
	return array;
}
}
