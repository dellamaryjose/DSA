package com.example.dsa.arrays;

import java.util.stream.IntStream;

public class FindOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = {1,2,3,4,5};
int[] newArray=removeOdd(array);
IntStream.range(0, newArray.length)
.forEach(i->System.out.println(newArray[i]));

	}

	
	public static int[] removeOdd (int[] array) {
		int oddCount =0;
		for(int i=0;i<array.length;i++) {
			if(array[i]%2!=0) {
				oddCount++;
			}
		}
			int newArray[] = new int [oddCount];
			int k=0;
			for(int j=0;j<array.length;j++) {
				
				if(array[j]%2!=0) {
					
				newArray[k]=array[j];
				k++;
				}
			}
			
			return newArray;
		
	}
}
