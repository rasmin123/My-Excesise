package com.hibernate.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.mapping.*;

public class OneToOneTest {
@SuppressWarnings("deprecation")
public static void main(String[] args) {
	Configuration configuration=new Configuration();
	configuration.configure();
	SessionFactory sessionFactory=configuration.buildSessionFactory();
	Session session=sessionFactory.openSession();
	
	UserDetails user=new UserDetails();
	user.setName("rammn");
	user.setUserId(100);
		
	Vechicle vechicle=new Vechicle();
	vechicle.setVechicleId(2001);
	vechicle.setVehicleName("carr");
	
	user.setVechicle(vechicle);
	Transaction transaction=session.beginTransaction();
	
	session.save(user);
	session.save(vechicle);
	
	
	transaction.commit();
	session.close();
	System.out.println("One to One with annotations is done..!!!!");
	sessionFactory.close();
	
	
}
}
