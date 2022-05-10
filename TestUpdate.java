package in.co.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestUpdate {
public static void main(String[] args) {
	TestUpdate();
}

private static void TestUpdate() {
	// TODO Auto-generated method stub
	User pojo = new User();
	pojo.setId(1);
	pojo.setUserID("UR1");
	pojo.setPassword("pass1234");
	pojo.setFirstName("Dheeraj");
	pojo.setLastName("Chaudary");
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
	s.update(pojo);
	tx.commit();
	s.close();
}
}
