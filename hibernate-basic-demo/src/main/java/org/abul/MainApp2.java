package org.abul;

import java.util.List;

import org.abul.config.HibernateConfig;
import org.abul.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class MainApp2 {

	public static void getAllCustomer() {
		SessionFactory sf = HibernateConfig.getSessionFactory();

		Session session = sf.getCurrentSession();

		try {
			// create a customer

		//	session.beginTransaction();


			retrieveCustomer(session);
			
			

			//session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("MainApp2 ");
			e.printStackTrace();
		}
	}

	private static void retrieveCustomer(Session session) {
		Query<Customer> customers = session.createQuery("from Customer");
		List<Customer> list = customers.getResultList();
		System.out.println(list);
	}

}
