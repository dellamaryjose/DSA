package com.example.dsa.search;

public class BinarySearch {  // DIVIDE & CONQUR

	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {4,6,7, 65,72};

		BinarySearch ls = new BinarySearch();

		boolean result1= ls.search(array,72);
		System.out.println(result1);
	}

	
	public boolean search(int[] array,int key) {
		
		boolean flag=false;
		int max = array.length-1;
		int min=0;
		
		while(min<=max) {
			
			int mid = (min+max)/2;
			
			if(array[mid]== key) {
				
				flag = true;
				return flag;
			}
			
			if(key<array[mid]) {
			
				max = mid-1;
				
			}else {
				
				min= mid+1;
				
			}
			
		}
		
		return flag;
	}
	
}
