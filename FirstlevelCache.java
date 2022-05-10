package in.co.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class FirstlevelCache {
public static void main(String[] args) {
	Testcache();
}

private static void Testcache() {
	// TODO Auto-generated method stub
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session s = factory.openSession();
	User user = (User)s.get(User.class,1);
	System.out.println(user.getId());
	System.out.println(user.getUserID());
	System.out.println(user.getPassword());
	System.out.println(user.getFirstName());
	System.out.println(user.getLastName());
	s.close();
	factory.close();
	SessionFactory factory1 = new Configuration().configure().buildSessionFactory();
	Session s1 = factory.openSession();
	User user1 = (User)s.get(User.class,1);
	System.out.println(user.getId());
	System.out.println(user.getUserID());
	System.out.println(user.getPassword());
	System.out.println(user.getFirstName());
	System.out.println(user.getLastName());
	s1.close();
	factory1.close();
}
}
