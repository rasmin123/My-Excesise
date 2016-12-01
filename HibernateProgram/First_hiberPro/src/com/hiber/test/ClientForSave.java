package com.hiber.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class ClientForSave {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Product p = new Product();
		/*
		 * Comment line code is for saving pojo class object
		 */

		
		 p.setProName("iphone");
		 p.setPrice(40000); 
		 p.setProductId(103);
		 Transaction tx=session.beginTransaction();
		 //session.save(p);
		 //session.persist(p);
		// session.saveOrUpdate(p);
		//session.delete(p);
        //System.out.println("deleted");
		

		System.out.println("sucessfully saved");
		Object lis=session.get(Product.class, new Integer(103));
		//Object lis = session.load(Product.class, new Integer(102));
		Product pro = (Product) lis;
		//System.out.println("Loaded object product name is___*****"
				//+ pro.getProName());
				System.out.println(pro);
		
		
		tx.commit();
		session.close();
		sf.close();

	}

}
