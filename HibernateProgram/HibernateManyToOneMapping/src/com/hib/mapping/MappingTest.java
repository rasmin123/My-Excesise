package com.hib.mapping;

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

		Vendor vendor = new Vendor();
		vendor.setVendorId(100);
		vendor.setVendorName("mathur");

		Customer customer = new Customer();
		customer.setCustomerId(2002);
		customer.setCustomerName("tarun");
		customer.setVendor(vendor);

		Customer customer2 = new Customer();
		customer2.setCustomerId(3003);
		customer2.setCustomerName("Arun");
		customer2.setVendor(vendor);

		Transaction transaction = session.beginTransaction();
		session.save(customer);

		session.save(customer2);

		transaction.commit();
		session.close();
		sessionFactory.close();

	}
}
