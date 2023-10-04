
public class NewTester {

	public static double divide(int num,int den) throws Exception{
		if(den==0) { 
			throw new Exception("Cannot divide by zero!");
		}
		return (double)num/den;
	}
	public static void main(String[] args) {
		try {
			System.out.println(divide(12, 2));
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
