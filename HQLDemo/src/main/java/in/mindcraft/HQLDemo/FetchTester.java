package in.mindcraft.HQLDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class FetchTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		MobilePhone m = (MobilePhone)session.get(MobilePhone.class, 10);
		System.out.println("Details of mobile: "+m);
		
		Transaction tx = session.beginTransaction();
	
		tx.commit();

	}

}
