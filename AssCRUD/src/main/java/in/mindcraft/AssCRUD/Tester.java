package in.mindcraft.AssCRUD;

import java.util.List;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding.Use;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


@Entity
class UserTable{
	@Id
	int id;
	String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "UserTable [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

public class Tester {

    public static void main(String[] args) {

        Configuration con = new Configuration().configure();
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert data");
            System.out.println("2. Read table");
            System.out.println("3. Update table");
            System.out.println("4. Delete table");
            System.out.println("5. Exit");
            System.out.println();
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Transaction tx = session.beginTransaction();

                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter name: ");
                    String name = sc.nextLine();

                    UserTable table = new UserTable();
                    table.setId(id);
                    table.setName(name);

                    try {
                        session.save(table);
                        tx.commit();
                        System.out.println("Record inserted successfully.");
                    } catch (Exception e) {
                        tx.rollback();
                        System.out.println();
                        System.out.println("Duplicate entry. Record not inserted.");
                    }
                    break;

                case 2:
                    Query query = session.createQuery("from UserTable");
                    List<UserTable> mlist = query.list();
                    for (UserTable u : mlist) {
                        System.out.println(u);
                    }
                    break;
                    
                case 3:
                    Transaction tx3 = session.beginTransaction();

                    System.out.print("Enter id to update: ");
                    int idToUpdate = sc.nextInt();
                    sc.nextLine();

                    UserTable existingUser = (UserTable)session.get(UserTable.class, idToUpdate);
                    if (existingUser != null) {
                        System.out.println("Enter new name: ");
                        String newName = sc.nextLine();

                        existingUser.setName(newName);
//                        session.update(existingUser);
                        tx3.commit();
                        System.out.println("Record updated successfully.");
                    } else {
                        System.out.println("Record not found.");
                    }
                    break;

                    
                case 4:
                    Transaction tx4 = session.beginTransaction();

                    System.out.print("Enter id to delete: ");
                    int idToDelete = sc.nextInt();
                    sc.nextLine();

                    Object userToDelete = session.get(UserTable.class, idToDelete);
                    if (userToDelete != null) {
                        session.delete(userToDelete);

                        tx4.commit();
                        System.out.println("Record deleted successfully.");
                    } else {
                        System.out.println("Record not found.");
                    }
                    break;

                    
                case 5:
                    System.out.println("Exiting...");
                    session.close();
                    sf.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }


    }
}




