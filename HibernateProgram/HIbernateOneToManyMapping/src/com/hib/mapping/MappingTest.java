package com.hib.mapping;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingTest {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure();
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();

		/*Vendor vendor = new Vendor();
		vendor.setVendorId(100);
		vendor.setVendorName("mathur");
		Vendor vendor2 = new Vendor();
		vendor2.setVendorId(200);
		vendor2.setVendorName("omm");

		Customer customer = new Customer();
		customer.setCustomerId(200);
		customer.setCustomerName("tarun");

		Customer customer2 = new Customer();
		customer2.setCustomerId(300);
		customer2.setCustomerName("Arun");
		Set<Customer> s = new HashSet<Customer>();
		s.add(customer);
		s.add(customer2);

		vendor.setCusid(s);

		Transaction transaction = session.beginTransaction();
		session.save(vendor);
		session.save(vendor2);

		transaction.commit();*/

		Object obj=session.get(Vendor.class,new Integer(100));
		Vendor vendor=(Vendor)obj;
		System.out.println(vendor.getVendorId());
		System.out.println(vendor.getVendorName());
		Set set=vendor.getCusid();
		Iterator<Customer>iterator=set.iterator();
		while (iterator.hasNext()) {
			Customer customer = (Customer) iterator.next();
			System.out.println(customer.getCustomerId());
			System.out.println(customer.getCustomerName());
			System.out.println(customer.getForVenId());
			
		}
		
		session.close();
		sessionFactory.close();

	}
}
