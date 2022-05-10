package in.co.rays.crud;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AuthenticateUser {
private User pojo;

public User authenticate(String login,String pwd) throws UserNotFoundException{
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session s = factory.openSession();
	Query q = s.createQuery("from User where userid=? and password =?");
	q.setString(0, login);
	q.setString(1,pwd);
	List list = q.list();
	if (list.size()==1) {
	 pojo = (User)list.get(0);
	} else {
throw new
UserNotFoundException();
	}
	s.close();
	return pojo;
}
}
