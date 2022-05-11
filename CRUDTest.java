package in.co.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CRUDTest {
public static void main(String[] args) {
	TestMerge();
}

private static void TestMerge() {
	// TODO Auto-generated method stub
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	User user = (User)session.get(User.class,1);
	System.out.println(user.getFirstName());
	session.close();
	user.setFirstName("Sanjay");
	Session session1 = factory.openSession();
	User user1 = (User)session1.get(User.class,1);
	Transaction tx = session1.beginTransaction();
	session1.merge(user);
	tx.commit();
	session1.close();
}


}
