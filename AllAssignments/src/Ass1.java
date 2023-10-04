/*
 1.Write  a program to check if given number is Armstrong number. A number is said to be amstrong nu    mber if sum of cube of digits is equal to the original number. 
e.g. 153 = 1+125+27= 153 
 */

import java.util.Scanner;

public class Ass1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number: ");
		int userNum = sc.nextInt();
		
		int copyOfUserNum = userNum;
		int result = 0;
		
		String numToString = Integer.toString(userNum);
		int lenOfUserNum = numToString.length();
		
		for(int i=0;i<lenOfUserNum;i++) {
			int singleNum = (userNum%10);
			double calculatedNum = Math.pow(singleNum, lenOfUserNum);
			result += calculatedNum;
			userNum /= 10;
		}
		
		if(result == copyOfUserNum) {
			System.out.println(copyOfUserNum+" is an armstrong number");
	
		}else {
			System.out.println(copyOfUserNum+" is not an armstrong number");
		}

	}

}
