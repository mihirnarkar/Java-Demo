package in.mindcraft.HibernateInheritance;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;


//@Table(name = "acctable")

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "acctable")
public class Account {
	@Id
	private int accid;
	private String name;
	private double balance;
	
	public int getAccid() {
		return accid;
	}
	
	public void setAccid(int accid) {
		this.accid = accid;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	
	
}