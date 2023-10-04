package in.mindcraft;

class NewCar extends Vehicle{
	
	public NewCar(String name,int cost,String type) {
		super(name, cost, type);
	}
	
	public void show() {
		super.show();
	}
}

public class Car{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewCar n = new NewCar("BMW", 112000, "Four weelers");
		n.show();
		

	}

}
