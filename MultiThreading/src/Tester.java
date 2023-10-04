
// Two ways to implement multithreading:-
//(1) Extending from the class Thread
//(2) Implementing interface runnable

class FirstThread extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("Hi");
		}
	}
}

class SecondThread extends Thread{
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("hello");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstThread ft = new FirstThread();
		SecondThread st = new SecondThread();
		ft.start();
		st.start();
	}

}
