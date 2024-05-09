package com.example.dsa.search;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int [] array = {4,6,34, 65,7};

LinearSearch ls = new LinearSearch();

boolean result1= ls.search(array, 5, 7);
System.out.println(result1);
	}

	
	public boolean search(int [] array, int length , int key) {
		boolean flag=false;
		for(int i=0;i<length;i++) {
			
			if(array[i] == key) {
				
				flag= true;
				break;
			}
		}
		return flag;
	}
}
