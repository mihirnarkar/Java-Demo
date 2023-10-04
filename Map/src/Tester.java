import java.util.*;

public class Tester {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
//		     keys     values
		
		map.put(100, "Mihir");
		map.put(101, "satish");
		map.put(99, "Jatin");
		
		System.out.println(map);
		
		System.out.println();
		
//		Printing only keys
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
//		Individual values
		System.out.println(map.get(100));
		
		System.out.println();
		
//		Printing all values
		for(Integer key: keys) {
			System.out.println(map.get(key));
		}
		
		
	}

}
