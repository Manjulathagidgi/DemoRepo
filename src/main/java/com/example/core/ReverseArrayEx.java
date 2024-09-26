package com.example.core;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayEx {
	
	 
//		public static void main(String args[])
//		{
//			String[] names = {"John", "Jammy", "Luke"};
//			System.out.println("original array: " + Arrays.toString(names) ); 
//			// reversing array with three elements 
//			reverse(names); 
//			System.out.println("reversed array: " + Arrays.toString(names) ); 
//			String[] test = {"John"}; 
//			System.out.println("original array: " + Arrays.toString(test) ); // testing reverse array function with array of just one element reverse(test); System.out.println("reversed array: " + Arrays.toString(test) ); }
//		}
//		
//		public static void reverse(String[] array) 
//		{ 
//			if (array == null || array.length < 2) 
//			{ 
//				return; 
//				}
//			for (int i = 0; i < array.length / 2; i++) 
//			{ String temp = array[i]; array[i] = array[array.length - 1 - i];
//			array[array.length - 1 - i] = temp; }
//		}

	

//	    public static void main(String[] args) {  
//	        //Initialize array  
//	        int [] arr = new int [] {1, 2, 3, 4, 5};  
//	        System.out.println("Original array: ");  
//	        for (int i = 0; i < arr.length; i++) {  
//	            System.out.print(arr[i] + " ");  
//	        }  
//	        System.out.println();  
//	        System.out.println("Array in reverse order: ");  
//	        //Loop through the array in reverse order  
//	        for (int i = arr.length-1; i >= 0; i--) {  
//	            System.out.print(arr[i] + " ");  
//	        }  
//	    }  
	
	
	 static void reverse(String myArray[])
	    {
	        Collections.reverse(Arrays.asList(myArray));
	        System.out.println("Reversed Array:" + Arrays.asList(myArray));
	    }
	 
	     public static void main(String[] args)
	    {
	        String [] myArray = {"one", "Two", "Three", "Four", "Five", "Six","Seven"};
	        System.out.println("Original Array:" + Arrays.asList(myArray));
	        reverse(myArray);
	    }
	
	
	}  
			

	