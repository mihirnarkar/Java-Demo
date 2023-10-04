package in.mindcraft.HibernateInheritance;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Account a1 = new Account();
		System.out.println("Enter id: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		a1.setAccid(id);
		a1.setName(name);
		a1.setBalance(300);
		
		SavingAcc s1 = new SavingAcc();
		s1.setAccid(500);
//		s1.setName("satish");
//		s1.setBalance(150);
		s1.setInterestRate(10);
		
		
		CurrentAcc aa1 = new CurrentAcc();
		aa1.setAccid(600);
//		aa1.setName("satvik");
//		aa1.setBalance(450);
		aa1.setOverLimit(10000);
		
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(a1);
		session.save(s1);
		session.save(aa1);
		
		tx.commit();
	
		
	}

}
