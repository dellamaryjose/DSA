package com.example.dsa.arrays;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] array = {3,2,4,1,6,7,8};

System.out.println(missingNum(array));
	}

	public static int missingNum(int[] array) {
	
		
		int len = array.length+1;
		int sum = len*(len+1)/2;
		System.out.println("sum--"+sum);
		for(int i=0;i<len-1;i++) {
			
			sum = sum - array[i];
			
		}
		return sum;
		
	}
}
