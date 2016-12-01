package com.hiber.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientForSave_2 {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sf=configuration.buildSessionFactory();
		Session session=sf.openSession();
		Object o=session.load(Product.class,new Integer(1005));
		Product s=(Product)o;
		
		
		Transaction tx = session.beginTransaction();
		s.setProName("cools  uu");
		tx.commit();
        System.out.println("Object saved successfully.....!!");
        
        session.close();
        sf.close();

	}

}
