package co.rays.crud;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Delete{
public static void testDelete()throws Exception{
	SessionFactory sf = HibernateUtil.getSessionFactory();
	Session session = sf.openSession();
	Transaction tx = null;
	try {
		tx = session.beginTransaction();
		User user = new User();
		user.setId(1);	
		session.delete(user);
		tx.commit();
	}catch(HibernateException e){
		tx.rollback();
	}finally {
		session.close();
		HibernateUtil.shutdown();
	}
}
}
