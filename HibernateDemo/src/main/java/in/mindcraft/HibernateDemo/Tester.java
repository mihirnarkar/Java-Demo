package in.mindcraft.HibernateDemo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Laptop l1 = new Laptop();
		l1.setLid(30);
		l1.setName("Asus");
		
		Laptop l2 = new Laptop();
		l2.setLid(40);
		l2.setName("Lenovo");
		
		Laptop l3 = new Laptop();
		l3.setLid(50);
		l3.setName("Dell");
		
		Student s1 = new Student();
		s1.setRollno(20);
		s1.setName("Mihir");
		
		Student s2 = new Student();
		s2.setRollno(30);
		s2.setName("Satish");
		
		Student s3 = new Student();
		s3.setRollno(40);
		s3.setName("Navin");
		
		
		s1.getList().add(l1);
		s2.getList().add(l2);
		s3.getList().add(l3);
		
//		l1.setStudent(s1);
//		l2.setStudent(s1);
//		l3.setStudent(s1);
		
		l1.getList().add(s1);
		l2.getList().add(s2);
		l3.getList().add(s3);
	
		
		Configuration con = new Configuration().configure();
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(l1);
		session.save(l2);
		session.save(l3);
		session.save(s1);
		session.save(s2);
		session.save(s3);
		tx.commit();

	}

}
