public class Tester {
	
	public static void fn1() throws InterruptedException {
		fn2();
	}
	
	public static void fn2() throws InterruptedException {
		System.out.println("fn2....");
		Thread.sleep(100);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			fn1(); // It may occured so then it will go in catch block
		}catch(InterruptedException e) {
			System.out.println("Error occured");
		}
	}

}
