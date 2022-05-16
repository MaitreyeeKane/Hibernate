package in.co.rays.fetching;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import in.co.rays.mapping.AuctionItem;
import in.co.rays.mapping.Bid;

public class Test1 {
	public static void main(String[] args) {
		AuctionItem item = new AuctionItem();
		item.setDescription("Auction1");

		Bid bid1 = new Bid();
		bid1.setAmount(100);

		Bid bid2 = new Bid();
		bid2.setAmount(200);

		Bid bid3 = new Bid();
		bid3.setAmount(300);

		Set<Bid> set = new HashSet<Bid>();
		set.add(bid1);
		set.add(bid2);
		set.add(bid3);

		item.setBids(set);

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		/*
		 * Transaction tx = session.beginTransaction(); session.save(item); tx.commit();
		 */
		Bid b =(Bid)session.get(Bid.class,1);
		System.out.println(b.getAmount());
		System.out.println(b.getId());
		System.out.println(b.getItemid());
		session.close();
		System.out.println("One To Many done"); 

	}
}
