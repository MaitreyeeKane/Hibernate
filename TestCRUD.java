package in.co.rays.crud;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class TestCRUD {
public static void main(String[] args) {
	TestAdd();
	TestGet();
	TestList();

	
}


private static void TestList() {
	//TODO Auto-generated method stub
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Query q = session.createQuery("select u.id from User u");
List<User> list = q.list();
	Iterator<User> it = list.iterator();
	while(it.hasNext()) {
	User user = it.next();
		System.out.println(user.getId());
		System.out.println("/t"+user.getFirstName());
		System.out.println("/t"+user.getLastName());
		System.out.println("/t"+user.getUserID());
		System.out.println("/t"+user.getPassword());
}}

private static void TestGet() {
	// TODO Auto-generated method stub
SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
User user = (User) session.get(User.class, 0);
System.out.println(user.getFirstName());
	System.out.println(user.getLastName());
System.out.println(user.getUserID());
	System.out.println(user.getPassword());
session.close();
}

private static void TestAdd() {
	// TODO Auto-generated method stub
	User user = new User();
	user.setId(1);
user.setFirstName("Shyam");
	user.setLastName("Sharma");
user.setUserID("shyam.sharma");
user.setPassword("pass1234");
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
Transaction tx = session.beginTransaction();
session.save(user);
tx.commit();
	session.close();
	System.out.println("Inserted");
	
}

}