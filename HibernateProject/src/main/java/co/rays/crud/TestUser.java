package in.co.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestUser {
	public static void main(String[] args) {

	}
@Test
	private void TestUpdate() {
		// TODO Auto-generated method stub
		User1 user = new User1();
		user.setId(1);
		user.setFname("Kriti");
		user.setLname("Menon");
	}
@BeforeClass
	private void TestDelete() {
		// TODO Auto-generated method stub
		System.out.println("executed Before class");
	}

@Before
	private void TestAdd() {
		// TODO Auto-generated method stub
		User1 user = new User1();
		user.setId(1);
		user.setFname("Priya");
		user.setLname("Menon");
	}
@After
private void TestList() {
	User1 user = new User1();
	System.out.println(user.getId());
	System.out.println(user.getFname());
	System.out.println(user.getLname());
}
@AfterClass
private void TestAfterClass() {
	System.out.println("Executed After class");
}
}
