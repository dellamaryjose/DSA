package com.example.dsa.arrays;

public class SecondMax {

	public static void main(String[] args) {
		// Find the secondMax element in an array
int [] array = {34,13,4,2,34,33,21};
System.out.println(find(array));
	}
public static int find(int[] array) {
	
	int secondLast =0;
	int max =0;
	
	for(int i=0;i<array.length;i++) {
	if(array[i]>max) {
		
		secondLast =max;
		max = array[i];
	}	else if(array[i]>secondLast && array[i]<max) {
		secondLast = array[i];
	}
		
	}
	return secondLast;
	
}
}
