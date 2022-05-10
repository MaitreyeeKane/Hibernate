package in.co.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestAdd {
public static void main(String[] args) throws Exception {
	TestAdd();	
}

private static void TestAdd() throws Exception{
	// TODO Auto-generated method stub
	User pojo = new User();
	pojo.setId(1);
	pojo.setUserID("UR1");
	pojo.setPassword("pass1234");
	pojo.setFirstName("Dheeraj");
	pojo.setLastName("Dubey");
	
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session s = factory.openSession();
	Transaction tx = s.beginTransaction();
	s.save(pojo);
	tx.commit();
	s.close();
}

}
