package com.hib.mapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OurLogic_loading {
public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml"); 

	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();		

    Object o = session.get(Address.class, new Integer(100));
    Address a = (Address)o;
    System.out.println(a.getCity());
    Student s=a.getS();
    System.out.println(s.getStudentName());

	    session.close();
	    System.out.println("One to One is Done..!!");
	    factory.close();
}
}
