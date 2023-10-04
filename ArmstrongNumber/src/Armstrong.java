import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
//		1.Write  a program to check if given number is Armstrong number. A number is said to be amstrong nu    mber if sum of cube of digits is equal to the original number. 
//		e.g. 153 = 1+125+27= 153 
		
//		1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt(); // 153
		int numberOfDigit = String.valueOf(num).length();
		int originalNumber = num;
		int sum = 0;
		
		while(num!=0) {
			int digit = num%10;
			sum += Math.pow(digit, numberOfDigit);
			num /= 10;
		}
		
		if(sum==originalNumber) {
			System.out.println("It is an armstrong");
		}else {
			System.out.println("Not an armstrong");
		}
		
		
		
		

	}

}
