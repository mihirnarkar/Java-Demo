package in.mindcraft.HQLDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MobilePhone m1 = new MobilePhone(10, "Samsung", 10000);
		MobilePhone m2 = new MobilePhone(20, "Oppo", 20000);
		MobilePhone m3 = new MobilePhone(30, "mi", 20500);
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(m1);
		session.save(m2);
		session.save(m3);
		
		tx.commit();

	}

}
