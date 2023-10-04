class Laptop{
	int id;
	String name;
	double price;
	
	public Laptop(int id,String name,double price) {
		this.id = id;
		this.name = name;
		this.price = price;
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
	
//	
}


public class NewOpps {

	public static void main(String[] args) {
		Laptop l1 = new Laptop(100, "Asus Expertbook", 45000);
		l1.showDetails();
		l1.setId(1);
		l1.setName("Lenovo");
		l1.setPrice(30000);
		l1.showDetails();

	}

}
