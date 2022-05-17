package co.rays.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Add {
	public static void main(String[] args) throws Exception {
		testAdd();
	}
public static void testAdd()throws Exception{
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session = sf.openSession();
	Transaction tx = null;
	try {	User user = new User();
	user.setId(2);
	user.setFname("Ram");
	user.setLname("Sharma");
	user.setUserName("Ram.Sharma");
	user.setPwd("pass1234");
	session.save(user);
	;}
	catch(HibernateException e) {
		tx.rollback();
	}finally {
		session.close();
		HibernateUtil.shutdown();
	}
	}}