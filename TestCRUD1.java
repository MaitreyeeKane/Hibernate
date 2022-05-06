package in.co.rays.crud;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class TestCRUD1 {
public static void main(String[] args) {
	TestLIST();
	TestCriteria();
}
private static void TestCriteria() {
	// TODO Auto-generated method stub
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Criteria criteria = session.createCriteria(User.class);
	List<User> list = criteria.list();
	Iterator<User>it = list.iterator();
	while(it.hasNext()) {
		User user = it.next();
		System.out.println(user.getId());
		System.out.println("/t"+user.getFirstName());
		System.out.println("/t"+user.getLastName());
		System.out.println("/t"+user.getUserID());
		System.out.println("/t"+user.getPassword());
}}


private static void TestLIST() {
	// TODO Auto-generated method stub
	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	Session session = factory.openSession();
	Criteria criteria = session.createCriteria(User.class);
ProjectionList p = Projections.projectionList();
p.add(Projections.property("FIRSTNAME"));
criteria.add(Restrictions.like("LASTNAME","sharma"));
criteria.setProjection(p);
List list = criteria.list();
Iterator it = list.iterator();
while(it.hasNext()) {
	String user = (String)it.next();
	System.out.println(user);
}

	
}


}
