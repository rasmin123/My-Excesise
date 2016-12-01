package com.hibernate.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmployeeTest {
	

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg=cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("Select eb from Employee as eb");
		List list=query.list();
		for (int i = 0; i < list.size(); i++) {
			Employee emp=(Employee) list.get(i);
			System.out.println(emp.getAddress()+" "+emp.getEmpid());
			
		}
		Transaction  tnx= session.beginTransaction();
		/*Employee emp1=new Employee(2000,"alok","saho",20000.0f,"chennai","alok@gmail.com");
		session.save(emp1);*/
		
		/*Query qry = session.createQuery("insert into Product(productId,proName,price)
				select i.itemId,i.itemName,i.itemPrice from Items i where i.itemId= ?");
					        qry.setParameter(0,600);
					        int res = qry.executeUpdate();
		
		
		Query query1=session.createQuery("insert into employee(empid,Fname) select eb.empids,eb.empFname from empdetails where eb.empids=?" ); 
	
		 query1.setParameter(0, 3000);
		 int result=query1.executeUpdate(); */
	    tnx.commit();
		
	}

}
