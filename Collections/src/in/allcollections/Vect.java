package in.allcollections;

import java.util.*;

// Vector:- It is called dynamically growing array

public class Vect {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(50);
		v.add(60);
		
//		3 ways to print these
		
//		Way - 1
	    System.out.print(v);
	    System.out.println();
	    
//	    Way - 2
	    for(Integer val : v) {
	    	System.out.print(val+" ");
	    }
	    System.out.println();
//	    Way - 3
	    Iterator<Integer> itr = v.iterator();
	    
	    while(itr.hasNext()) {
	    	System.out.print(itr.next()+" ");
	    }
	    
	    System.out.println();
	    
//	    Accessing single value:
	    System.out.println(v.get(2)*5);
	    

	}

}
