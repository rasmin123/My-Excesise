package com.hiber.test;
import org.hibernate.*;
import com.hiber.test.HibernateUtil;
import org.hibernate.cfg.*;
public class ClientForSave_1 {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Product product=new Product();
		product.setProductId(1000);
		product.setPrice(37000);
		product.setProName("cools");
		Transaction tx = session.beginTransaction();
        session.save(product);
        System.out.println("Object saved successfully.....!!");
        tx.commit();
        session.close();
        
	

	}

}
