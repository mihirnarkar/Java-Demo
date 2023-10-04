package in.mindcraft.HibernateAss;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		
//		Employee e1 = new Employee();
		Address officeAddress = new Address();
		officeAddress.setCity("Mumbai");
		officeAddress.setState("Maharashtra");
		officeAddress.setStreet("Andheri");
		
		
		Address homeAddress = new Address();
		homeAddress.setCity("Mumbai");
		homeAddress.setState("Maharashtra");
		homeAddress.setStreet("lalbagh");
		
		
		Employee e1 = new Employee();
		e1.setEmpid(100);
		e1.setName("Mihir");
		e1.getList().add(officeAddress);
		e1.getList().add(homeAddress);
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(homeAddress);
		session.save(officeAddress);
		session.save(e1);
		
		tx.commit();
	}

}
