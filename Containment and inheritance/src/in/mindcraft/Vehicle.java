package in.mindcraft;

public class Vehicle {

	private String name;
	private int cost;
	private String type;
	
	public Vehicle(String name,int cost,String type) {
		this.name = name;
		this.cost = cost;
		this.type = type;
	}
	
	public void show() {
		System.out.println("Name: "+this.name);
		System.out.println("Cost: "+this.cost);
		System.out.println("Type: "+this.type);
	}
	

}
