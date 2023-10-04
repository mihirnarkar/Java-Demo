
/*
5.Create a class AccountHolder with -
		Instance variables - account number, account holder name, account balance
		Class methods - constructors, getter/setter methods, deposite, withdraw
	Create an array of AccountHolder objects in main. 
	Write a menu driven program to perform -
			1. Add record for account holder
			2. Display details of all account holders.
			3. Deposite an amount into perticular account
			4. Withdraw an amount from perticular account
 */
// Solution:-

import java.util.Scanner;

class AccountHolder{
	
	private long accountNum;
	private String accountHoldName;
	private long accountBal;
	
	public AccountHolder() {
		accountNum = 0;
		accountHoldName = "Sample name";
		accountBal = 0;
	}
	
	public AccountHolder(long accountNum,String accountHoldName,long accountBal) {
		this.accountNum = accountNum;
		this.accountHoldName = accountHoldName;
		this.accountBal = accountBal;
	}
	
	public void displayDetails() {
		System.out.println("Account name: "+this.accountHoldName);
		System.out.println("Account no: "+this.accountNum);
		System.out.println("Account balance: "+this.accountBal);
	}
	
	public long getAccountNo() {
		return this.accountNum;
	}
	
	public String getAccountName() {
		return this.accountHoldName;
	}
	
	public long getAccountBalance() {
		return this.accountBal;
	}
	
	public void deposit(long amount) {
		this.accountBal += amount;
	}
	
	public void withdraw(long amount) {
		this.accountBal -= amount;
	}
	
}

public class Ass5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many account you wanna open: ");
		int accSize = sc.nextInt();
		AccountHolder [] newAcc = new AccountHolder[accSize];
		
		
		System.out.println("Choose from below: ");
		System.out.println("0 - Exit");
		System.out.println("1 - Add record for account holder");
		System.out.println("2 - Display details of all account holders");
		System.out.println("3 - Deposite an amount into particular account");
		System.out.println("4 - Withdraw an amount from particular account");
		
		while(true) {
			System.out.print("Enter your choice: ");
			
			int userChoice = sc.nextInt();
			
			if(userChoice == 0) {
				System.out.println("Thank you visit again!");
				break;
			}
			
			switch(userChoice) {
			case 1:
				System.out.println("Lets start with adding record");
				System.out.print("Enter account no: ");
				long accNo = sc.nextLong();
				sc.nextLine();
				System.out.print("Enter account holder name: ");
				String accName = sc.nextLine();
				System.out.print("Enter account balance: ");
				long accBalance = sc.nextLong();
				
				AccountHolder account1 = new AccountHolder(accNo,accName,accBalance);
				for(int i=0;i<accSize;i++) {
					if(newAcc[i]==null) {
						newAcc[i] = account1;
						break;
					}
				}
				System.out.println("Account holder added successfully");
				break;
				
			case 2:
				System.out.println("Displaying all records");
				for(int i=0;i<accSize;i++) {
					if(newAcc[i]!=null) {
						newAcc[i].displayDetails();
						System.out.println();
					}
				}
				break;
				
			case 3:
				System.out.println("Deposit an amount");
				System.out.print("Enter amount: ");
				long amount = sc.nextLong();
				System.out.print("Enter account no: ");
				long accNo1 = sc.nextLong();
				
				for(int i=0;i<accSize;i++) {
					if((newAcc[i]!=null) && (newAcc[i].getAccountNo() == accNo1)) {
						newAcc[i].deposit(amount);
						System.out.println("Amount deposited successfully");
						break;
					}
				}
				break;
				
			
			case 4:
				System.out.println("Withdraw an amount");
				System.out.print("Enter amount: ");
				long withAmount = sc.nextLong();
				System.out.println("Enter account no: ");
				long withAccounNo = sc.nextLong();
				
				for(int i=0;i<accSize;i++) {
					if((newAcc[i]!=null) && (newAcc[i].getAccountBalance() > withAmount) && (newAcc[i].getAccountNo() == withAccounNo)) {
						newAcc[i].withdraw(withAmount);
						System.out.println("Amount withdraw successfully");
					}
				}
			}
				
		}

	}

}
