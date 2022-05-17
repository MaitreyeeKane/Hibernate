package co.rays.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
public class Update {
	public static void main(String[] args) throws Exception {
		testUpdate();
	}
	public static void testUpdate()throws Exception{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		Transaction tx = null;
		try {
			tx = session.beginTransaction();
			User user = new User();
			user.setId(1);
			user.setFname("Shyam");
			user.setLname("Verma");
			user.setUserName("Shyam.sharma");
			user.setPwd("IDK");
	session.update(user);	
	tx.commit();
		}catch(HibernateException e) {
			tx.rollback();
		} finally {
			session.close();
			HibernateUtil.shutdown();
		}
		}
}
