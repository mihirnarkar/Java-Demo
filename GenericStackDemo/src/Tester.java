class Stack{
	private int size;
	private int top;
	private int [] arr;
	
	public Stack() {
		this.size = 5;
		this.top = -1;
		this.arr = new int[this.size];
	}
	
	public Stack(int size) {
		this.size = size;
		this.top = -1;
		this.arr = new int[size];
	}
	
	public void push(int num) throws Exception  {
		if(!isFull()) {
			arr[++top]=num;
		}else {
			throw new Exception("Overflow");
		}
	}
	
	public int pop() throws Exception{
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


public class Tester {

	public static void main(String[] args) {
		Stack s1 = new Stack(5);
		try {
			s1.push(10);
			s1.push(20);
			s1.push(30);
			s1.push(40);
			s1.push(50);
			s1.pop();
			s1.pop();
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
