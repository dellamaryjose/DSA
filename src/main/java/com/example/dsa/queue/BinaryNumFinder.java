package com.example.dsa.queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
public class BinaryNumFinder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[] = finder(8);
Arrays.stream(s).forEach(i-> System.out.println(i));

	}

	
	public static String[] finder(int num) {
		
		String [] array = new String[num];
		
		Queue<String> queue = new LinkedList<>();
		queue.offer("1");
		int i=0;
		String num1="";
		String num2="";
		while(i<num) {
			array[i] = queue.poll();
			num1= array[i]+"0";
			num2=array[i]+"1";
			queue.offer(num1);
			queue.offer(num2);
			i++;
		}
		
		
		return array;
		
		
	}
}
