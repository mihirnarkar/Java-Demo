class Hello{
	static {
		System.out.println("This is a static block 1");
	}
	
	static{
		System.out.println("This is a static block 2");
	}
	
	{
		System.out.println("This is a instance block");
	}
}


public class StaticAndInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello h = new Hello();

	}

}
