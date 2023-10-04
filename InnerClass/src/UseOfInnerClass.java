class A{
	public A() {
		System.out.println("This is outer class A");
	}
	
	static int a;
	static class B{
		
		public void fn() {
			a = 120;
			System.out.println("This is inner class");
		}
	}
	
	class C{
		public C() {
			System.out.println("This is Inner class C");
		}
	}
	
}

public class UseOfInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A.B inner = new A.B();
		inner.fn();
		A a = new A();
//		A.C c = new A.C(); --> This will give an arror
		A.C c = a.new C(); // --> Correct way to do this
		
	}

}
