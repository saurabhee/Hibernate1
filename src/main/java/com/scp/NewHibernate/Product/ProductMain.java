package com.scp.NewHibernate.Product;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.classic.Session;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product1 p1=new Product1(1,"TV");
		Product1 p2=new Product1(2,"Fridge");
		
		Configuration cf=new Configuration();
		SessionFactory sf=cf.configure().buildSessionFactory();
		Session s = sf.openSession();
		Transaction tr = s.beginTransaction();
		s.save(p1);
		s.save(p2);
		tr.commit();
		s.close();
		

	}

}
