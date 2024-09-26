package com.example.core;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateString {
	
	    public static void main(String[] args) {  
	        List<String> l = new ArrayList<String>();  
	        l.add("Mango");  
	        l.add("Banana");  
	        l.add("Mango");  
	        l.add("Apple");  
	        System.out.println(l.toString());  
	        Set<String> s = new HashSet<String>(l);  
	        System.out.println(s);  
	        
	        List<Integer> ll = new ArrayList<Integer>();  
	        ll.add(1);  
	        ll.add(2);  
	        ll.add(2);  
	        ll.add(3);  
	        System.out.println(ll.toString());  
	        Set<Integer> ss = new HashSet<Integer>(ll);  
	        System.out.println(ss);
	    }  
	 

}
