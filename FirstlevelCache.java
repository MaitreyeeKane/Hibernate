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
	User pojo = new User();
	pojo.getId();
	pojo.getUserID();
	pojo.getFirstName();
	pojo.getLastName();
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
	s.close();//flc
	User pojo1 = new User();
	pojo1.getId();
	pojo1.getUserID();
	pojo1.getFirstName();
	pojo.getLastName();
	SessionFactory factory1 = new Configuration().configure().buildSessionFactory();
	Session s1 = factory.openSession();
	Transaction tx1 = s1.beginTransaction();
	s.close();//slc
}
}
