package com.hiber.test;

import java.io.File;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			// Create the SessionFactory from hibernate.cfg.xml
			return new AnnotationConfiguration().configure()
					.buildSessionFactory();
		} catch (Exception e) {
			// Make sure you log the exception, as it might be swallowed
			System.err.println("Initial SessionFactory creation failed." + e);
			throw new ExceptionInInitializerError(e);
		}
		// TODO Auto-generated method stub

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
