package com.java.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;



public class ArrayListPractice {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<>();
		System.out.println("Size :"+ arr.size());
		
		arr.add(20);
		arr.add(34);
		arr.add(8);
		arr.add(3,24);
		
		System.out.println("Size :"+ arr.size());
		
		
		System.out.println("Array :"+ arr);//normally
		
		Collections.sort(arr);
		System.out.println("Array assending:"+ arr);
		
		
		
		Collections.sort(arr,Collections.reverseOrder());
		System.out.println("Array decending:"+ arr);
		
		boolean arr3 = arr.isEmpty();
		System.out.println(arr3);
		
		System.out.println("Array :");//foreach
		for(int i : arr) {
			System.out.print(" "+i);
		}

		System.out.println();
		System.out.println("Array Iterator :");
		
		Iterator itr =  arr.iterator();//iterator
		while(itr.hasNext()) {
			System.out.print(" "+itr.next());
		}
		System.out.println();
		arr.remove(1);
		System.out.println("Array :"+ arr);
		System.out.println();
		
		
		//arr.removeAll(arr);
		arr.clear();
		System.out.println("Array :"+ arr);
		
		boolean arr2 = arr.isEmpty();
		System.out.println(arr2);
		
	}

}
