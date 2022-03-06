package com.mphasis;
import java.util.*;

public class CollectionExample {

	public static void main(String[] args) {
		
		
		//creating arraylist
		
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Bangalore");//
	      city.add("Delhi");
	      city.add("Hyderabad");
	      System.out.println(city);  
		
		//creating vector
	      
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vc = new Vector();
	      vc.addElement(15); 
	      vc.addElement(30);
	      vc.addElement(50);
	      System.out.println(vc);
		
         //creating linkedlist
	      
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Alex");  
	      names.add("John"); 
	      names.add("Supraja");
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
	       //creating hashset
	       
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(105);  
	       set.add(110);  
	       set.add(102);
	       System.out.println(set);
	       
	       //creating linkedhashset
	       
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(12);  
	       set2.add(13);  
	       set2.add(12);
	       set2.add(14);
	       set2.add(20);
	       System.out.println(set2);
	      	} 
}
}