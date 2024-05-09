package com.example.dsa.sortedmatrix;

public class SearchMatrixUtil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[][] matrix = {{10,20,30,40},
		{15,25,35,45},
		{27,29,30,48},
		{32,33,39,51},
		
		
};

boolean flag = SortedMatrix.search(matrix, 2, 4);
System.out.println(flag);
	}

}
