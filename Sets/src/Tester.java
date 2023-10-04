import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(10);
		set.add(60);
		set.add(20);
		set.add(40);
		set.add(10);
		set.add(10);
		
		System.out.println("Hash set: "+set);
		
		Set<Integer> set1 = new LinkedHashSet<>();
		
		set1.add(10);
		set1.add(60);
		set1.add(20);
		set1.add(40);
		set1.add(10);
		set1.add(10);
		
		System.out.println("Linked set: "+set1);
		
		
	    Set<Integer> set2 = new TreeSet<>();
		
		set2.add(10);
		set2.add(60);
		set2.add(20);
		set2.add(40);
		set2.add(10);
		set2.add(10);
		
		System.out.println("Tree set: "+set2);

	}

}
