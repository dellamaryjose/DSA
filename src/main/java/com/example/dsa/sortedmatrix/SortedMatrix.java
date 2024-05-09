package com.example.dsa.sortedmatrix;

public class SortedMatrix {

	
	
	
	public static boolean search(int[][] matrix,int key,int n) {
		
		boolean flag= false;
		int j=n-1;
		int i=0;
		while(j>=0) {
		int value = matrix[i][j];
		if(value==key) {
			return true;
		}
		if(value<key) {
		i++;	
		}
		if(value>key) {
			j--;
		}
		}
		return flag;
	}
}
