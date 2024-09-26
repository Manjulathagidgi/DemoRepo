package com.example.core;

import java.util.ArrayList;
import java.util.List;

import java.util.stream.Collectors;

public class Example1 {
	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Vaishu");
		list.add("Cherry");
		
		list.forEach(s-> System.out.println(s));
		
		List<String> ll=list.stream().filter(a->a=="Vaishu")
		.collect(Collectors.toList());
		System.out.println(ll);
		Long l=list.stream()
				.collect(Collectors.counting());
				System.out.println(l);
		
		list.stream().filter(a->a=="Vaishu").forEach(System.out::println);
	}

}
