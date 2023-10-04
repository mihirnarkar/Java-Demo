class Mymath<G>{
	
	public void swap(G a,G b) {
		G temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println(a+" "+b);
	}
}

public class Tester {

	public static void main(String[] args) {
		Mymath <Integer> m1 = new Mymath<>();
		m1.swap(2, 4);
		Mymath <String> m2 = new Mymath<>();
		m2.swap("Mihir", "Srushti");
	}

}
