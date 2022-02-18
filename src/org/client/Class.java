package org.client;

import java.util.*;

public class Class {
	public static void main(String[] args) {
		List li = new LinkedList();
		li.add(10);
		li.add("java");
		li.add('a');
		li.add(999999999999l);
		System.out.println(li);
		int size = li.size();
		System.out.println(size);
		 li.remove(0);
		 System.out.println(li);
		 li.add(2, "jexi");
		 System.out.println(li);
		 for (int i = 0; i < li.size(); i++) {
			 System.out.println(i);
			 System.out.println("enhanced for loop");
			 for (Object object : li) {
				 System.out.println(object);
				 
			}
			 boolean contains = li.contains("java");
			 System.out.println(contains);
			
			 
				
			}
			
		}

	}
	



			
		
		
	
	

	
		
	


