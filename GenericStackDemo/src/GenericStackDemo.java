class Stack1<G>{
	private int size;
	private int top;
	private G [] arr;
	
	@SuppressWarnings("unchecked")
	public Stack1() {
		this.size = 5;
		this.top = -1;
		this.arr = (G[]) new Object[this.size];
	}
	
	@SuppressWarnings("unchecked")
	public Stack1(int size) {
		this.size = size;
		this.top = -1;
		this.arr = (G[]) new Object[this.size];
	}
	
	public void push(G num) throws Exception  {
		if(!isFull()) {
			arr[++top]=num;
		}else {
			throw new Exception("Overflow");
		}
	}
	
	public G pop() throws Exception{
		if(!isEmpty()) {
			return arr[this.top--];
		}
		else {
			throw new Exception("Underflow");
		}
	}
	
	public boolean isFull(){
		return this.top==this.size - 1;
	}
	
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	public void display(){
		for(int i=0;i<=this.top;i++) {
			System.out.println(this.arr[i]);
		}
	}
}

public class GenericStackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack1 <Integer> s1 = new Stack1<>();
		try {
			System.out.println("Before popping: ");
			s1.push(10);
			s1.push(20);
			s1.push(30);
			s1.push(40);
			s1.push(50);
			s1.display();
			System.out.println("---");
			System.out.println("After popping: ");
			s1.pop();
			s1.pop();
			s1.pop();
			s1.display();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		System.out.println("--------------------");
		
		Stack1 <String> s2 = new Stack1<>(5);
		try {
			System.out.println("Before popping: ");
			s2.push("Mihir");
			s2.push("Srushti");
			s2.push("Jatin");
			s2.push("Purva");
			s2.push("jay");
			s2.display();
			System.out.println("-----");
			System.out.println("After popping: ");
			s2.pop();
			s2.pop();
			s2.pop();
			s2.display();
		}catch (Exception e) {
			System.out.println(e);
		}
		

	}

}
