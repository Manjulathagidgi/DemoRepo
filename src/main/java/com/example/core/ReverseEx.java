package com.example.core;

import java.util.Scanner;

public class ReverseEx {
	
//	public static void main(String[] args) {
//		
//		System.out.println(reverse("abcd"));
//	}
//	
//	public static String reverse(String source) {
//		if(source==null || source.isEmpty()) {
//			return source;
//		}
//		String reverse="";
//		for(int i=source.length()-1;i>=0;i--) {
//			reverse=reverse+source.charAt(i);
//		}
//		return reverse;
//	}
	
	
	

    public static void main(String args[]) {
       //input number to reverse
        System.out.println("Please enter number to be reversed using Java program: ");
        int number = new Scanner(System.in).nextInt();
     
        int reverse = reverse(number);
        System.out.println("Reverse of number: " + number + " is " + reverse(number));  
   
    }
 
    /*
     * reverse a number in Java using iteration
     * @return reverse of number
     */
    public static int reverse(int number){
        int reverse = 0;
        int remainder = 0;
        do{
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number = number/10;
         
        }while(number > 0);
     
        return reverse;
    }



}
