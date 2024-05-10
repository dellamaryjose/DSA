package com.example.dsa.sort;

import java.util.stream.IntStream;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BubbleSort bs = new BubbleSort();
int array[] = {4,6,2,1,5,3};

int newArray[] = bs.bubbleSort(array);
IntStream.range(0, newArray.length).forEach(i->System.out.print(newArray[i]+"--"));
	}

	
	public int[] bubbleSort(int [] array) {
		boolean flag = false;
		for(int i=0;i<array.length-1;i++) {
			flag = false;
			for(int j=0;j<array.length-1-i;j++) {
				
				if(array[j]>array[j+1]) {
					
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					flag = true;
				}
				
			}
			if(!flag) {
				
				break;
			}
		}
		
		return array;
	}
}
