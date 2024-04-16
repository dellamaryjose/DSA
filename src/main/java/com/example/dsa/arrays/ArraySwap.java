package com.example.dsa.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {4,6,7,2,3,1};
int[] newArray = swapArray(array, 0, 5);
List<Integer> list = Arrays.asList(1,4,5,6);

IntStream.range(0, array.length).forEach(i->System.out.println(newArray[i]) );


	}

	
	public static int[] swapArray(int num[] , int start , int end) {
		int temp =0;
		while(start<end) {
		
			temp = num[start];
			num[start] = num[end];
			num[end] = temp;
			start++;
			end--;
				
				
			}
		return num;
	}
}
