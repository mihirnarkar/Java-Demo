import java.util.*;

// Comparable interfaces
class Laptop implements Comparable<Laptop>{
	private int lid;
	private String make;
	private double cost;
	
	public Laptop() {
		lid = 101;
		make = "Apple";
		cost = 75000;
	}
	
	public Laptop(int lid,String make,double cost) {
		this.lid = lid;
		this.make = make;
		this.cost = cost;
	}
	
	public void show() {
		System.out.println(this.lid+" "+this.make+" "+this.cost);
	}
	
	public int compareTo(Laptop o) {
		if(this.cost < o.cost)
			return -1;
		else if(this.cost > o.cost)
			return 1;
		else
			return 0;
	}
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Laptop> set = new TreeSet<>();
		set.add(new Laptop(101,"Dell",50000));
		set.add(new Laptop(102,"Lenovo",40000));
		set.add(new Laptop(103,"HP",60000));
		set.add(new Laptop(104,"Asus",50000));
		set.add(new Laptop(105,"New",80000));
		
		System.out.println(set);

	}

}
