class Account{
	private int balance;
	
	public Account() {
		this.balance = 10000;
	}
	
	public void deposit(int amount) {
		synchronized (this) {
			System.out.println("Balance before deposit: "+this.balance);
			this.balance = this.balance + amount;
			System.out.println("Balance after deposit: "+this.balance);
		}
	}
	
	public void withdraw(int amount) {
		synchronized (this) {
			System.out.println("balance before withdraw: "+this.balance);
			this.balance = this.balance - amount;
			System.out.println("balance after withdraw: "+this.balance);
		}
	}
}

class AccountUser extends Thread{
	String name,tot;
	Account acccount;
	int amount;
	
	public AccountUser(String name,Account account,String tot,int amount) {
		this.name = name;
		this.tot = tot;
		this.acccount = account;
		this.amount = amount;
	}
	
	public void run() {
		if(tot.equals("deposit")) {
			acccount.deposit(amount);
		}
		else if(tot.equals("withdraw")) {
			acccount.withdraw(amount);
		}
	}
}


public class Tester {

	public static void main(String[] args) {
		Account account = new Account();
		
		AccountUser user1 = new AccountUser("Mihir", account,"deposit",5000);
		AccountUser user2 = new AccountUser("Satish", account,"withdraw",2000);
		
		user1.start();
		user2.start();

	}

}
