package co.rays.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Get {
	public static void testGet()throws Exception{
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		User u = (User)session.get(User.class,1);
		System.out.println(u.getId());
		System.out.println(u.getFname());
		System.out.println(u.getLname());
		System.out.println(u.getUserName());
		System.out.println(u.getPwd());
		session.close();
		HibernateUtil.shutdown();
}}
