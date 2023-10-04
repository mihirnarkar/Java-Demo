
public class Addition {
	public static int add(int ...a) {
		int sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println("Addition of 1+4+5 = "+add(1,4,5));
		System.out.println("Addition of 1+4+5+9 = "+add(1,4,5,9));
		System.out.println("Addition of 1+4+5+9+10 = "+add(1,4,5,9,10));

	}

}
