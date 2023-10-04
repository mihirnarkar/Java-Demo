import java.util.Scanner;

public class SwappingNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter number 2: ");
		int num2 = sc.nextInt();
		
		System.out.println("Before swapping: a="+num1+", b="+num2);
		
		int temp = num1;
		
		num1 = num2;
		
		num2 = temp;
		
		
		System.out.println("After swapping: a="+num1+", b="+num2);
		
		

	}

}
