class Laptop{
	private static int counter=0;
	
	public Laptop() {
		counter++;
		System.out.println("Hi this is constructor");
	}
	
	public Laptop(String name) {
		counter++;
		System.out.println("Hi this is constructor created by "+name);
	}
	
	public static int showCnt() {
		return counter;
	}
}


public class Sample {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		Laptop l2 = new Laptop();
		Laptop l3 = new Laptop("Mihir");
		System.out.println("Number of objects: "+l3.showCnt());
	}

}
