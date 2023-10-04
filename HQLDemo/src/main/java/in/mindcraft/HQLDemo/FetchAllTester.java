package in.mindcraft.HQLDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.List;

import org.hibernate.Query;

public class FetchAllTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
//		MobilePhone m = (MobilePhone)session.get(MobilePhone.class, 10);
//		System.out.println("Details of mobile: "+m);
		
//		Query query = session.createQuery("from MobilePhone");
//		List<MobilePhone> mlist = query.list();
//		for(MobilePhone m : mlist) {
//			System.out.println(m);
//		}
		
		Query query = session.createQuery("from MobilePhone where cost>15000");
		List<MobilePhone> mlist = query.list();
		for(MobilePhone m : mlist) {
			System.out.println(m);
		}
		tx.commit();

	}

}
