
/*
Create a class Account with -
		Instance variable - balance
		Class methods - deposite/withdraw
	User withdrawal limit on one transaction is Rs.15000/-
	Throw and Handle Exceptions -
		1. OverLimit - when user tries to withdraw more than Rs. 15000/- in a transaction
		2. InsufficientBalance - When user withdrawal amount is more than existing balance
 */

import java.util.Scanner;

class Account{
	private int balance;
	
	public Account(int b) {
		this.balance = b;
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
	
	public int withdraw(int amount) throws Exception {
		if(amount>15000) {
			throw new Exception("Overlimit! cant withdraw more than 15000");
		}else if(amount>this.balance) {
			throw new Exception("Insufficient balance!");
		}
		balance-=amount;
		return this.balance;
	}
}

public class Ass19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your balance: ");
		int balAmount = sc.nextInt();
		Account newAcc = new Account(balAmount);
		
		try {
			System.out.print("Enter amount to withdraw: ");
			int withdrawAmount = sc.nextInt();
			System.out.println("Balance: "+newAcc.withdraw(withdrawAmount));
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
