class Laptop{
	int id;
	String name;
	double price;
	private static int cnt;
	
	static {
		cnt=0;
	}
	
	public Laptop(int id,String name,double price) {
		this.id = id;
		this.name = name;
		this.price = price;
		cnt++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void showDetails() {
		System.out.println("Name: "+this.name);
		System.out.println("Id: "+this.id);
		System.out.println("Price: "+this.price);
	}
	
	public static void showCnt() {
		System.out.println("Number of objects: "+cnt);
	}
	
//	
}


public class UseOfCounterUsingStatic {

	public static void main(String[] args) {
		Laptop l1 = new Laptop(0, null, 0);
		Laptop l2 = new Laptop(0, null, 0);
		Laptop l3 = new Laptop(0, null, 0);
		
		
		
//		Call by any method
		l3.showCnt();

	}

}
