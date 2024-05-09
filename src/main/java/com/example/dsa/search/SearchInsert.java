package com.example.dsa.search;

public class SearchInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {4,6,7, 65,72};

		SearchInsert ls = new SearchInsert();

		int result1= ls.searchInsert(array,2);
		System.out.println(result1);

	}

	
	public int searchInsert(int[] array, int key) {
		
		int min = 0;
		int max = array.length-1;
		
		while(min<=max) {
			
			int mid = min+(max-min)/2;
			
			if(array[mid]==key) {
				
				
		return mid;	
			}
			if(key<array[mid]) {
				
				max = mid-1;
			}else {
				
				min = mid+1;
			}
		}
		
		return min;
	}
}
