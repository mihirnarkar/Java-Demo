import java.util.Scanner;

class AccountHolderSample {

	long accNo;
	String accName;
	int accBalance;
	
	public AccountHolderSample(long accNo,String accName,int accBalance) {
		this.accNo = accNo;
		this.accName = accName;
		this.accBalance = accBalance;
	}
	
//	set accNo
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
//	set accName
	public void setAccName(String accName) {
		this.accName = accName;
	}
	
//	set accBalance
	public void setAccBalance(int accBalance) {
		this.accBalance = accBalance;
	}
	
//	get accNo
	public long getAccNo() {
		return this.accNo;
	}
	
//	get accName
	public String getAccName() {
		return this.accName;
	}
	
//	get accBalance
	public int getAccBalance() {
		return this.accBalance;
	}
	
//	deposit
	public void deposit(int amount) {
		this.accBalance = this.accBalance + amount;
	}
	
//	Withdraw
	public void withdraw(int amount) {
		this.accBalance = this.accBalance - amount;
	}

}


public class AccountHolder{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of accounts: ");
		int accCount = sc.nextInt();
		
		AccountHolderSample[] arr = new AccountHolderSample[accCount];
		
		int choice;
		long accNo;
		int amount;
		
		while(true) {
			System.out.println("Enter your choice: ");
			System.out.println("1. Add record ");
			System.out.println("2. Display details of account holders");
			System.out.println("3. Deposit ");
			System.out.println("4. Withdraw");
			System.out.println("0. Exit");
			
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();
			
			if(choice==0) {
				break;
			}
			
			switch(choice) {
			case 1:
				System.out.print("Enter account number: ");
				accNo = sc.nextLong();
				sc.nextLine();
				System.out.print("Enter account holder name: ");
				String accName = sc.nextLine();
				System.out.print("Enter account balance: ");
				int balance = sc.nextInt();
				
				AccountHolderSample account1 = new AccountHolderSample(accNo, accName, balance);
				
				for(int i=0;i<accCount;i++) {
					if(arr[i]==null) {
						arr[i] = account1;
						break;
					}
				}
				System.out.println("Account holder added successfully");
				break;
				
			case 2:
				System.out.println("Displaying details of all account holders: ");
				for(AccountHolderSample accountHolder : arr) {
					if(accountHolder != null) {
						System.out.println("Account no. "+accountHolder.getAccNo());
						System.out.println("Account name. "+accountHolder.getAccName());
						System.out.println("Account balance: "+accountHolder.getAccBalance());
						System.out.println();
					}
				}
				break;
				
			case 3:
				System.out.print("Enter account no: ");
				long userAccNo = sc.nextLong();
				System.out.println("Enter amount to deposit: ");
				int userAmount = sc.nextInt();
				
				for(AccountHolderSample accountHolder : arr) {
					if(accountHolder!=null && userAccNo == accountHolder.getAccNo()) {
						accountHolder.deposit(userAmount);
						System.out.println("Amount added successfully");
					}
				}
				break;
				
			case 4:
				System.out.print("Enter account no: ");
				long userAccNo1 = sc.nextLong();
				System.out.println("Enter amount to withdraw: ");
				int userAmount1 = sc.nextInt();
				
				for(AccountHolderSample accountHolder : arr) {
					if(accountHolder != null && userAccNo1 == accountHolder.getAccNo()) {
						if(userAmount1 < accountHolder.getAccBalance()) {
							accountHolder.withdraw(userAmount1);
							System.out.println("Amount withdraw successfully");
						}else {
							System.out.println("Sorry cant add!");
						}
					}
				}
				break;
				
			}
			
		}
		
			
		
		
	}
}
