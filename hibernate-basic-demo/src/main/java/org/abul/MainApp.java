package org.abul;

import java.util.List;

import org.abul.config.HibernateConfig;
import org.abul.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class MainApp {

	public static void main(String args[]) {
		SessionFactory sf = HibernateConfig.getSessionFactory();

		Session session = sf.getCurrentSession();

		try {
			// create a customer

			session.beginTransaction();

			addCustomer(session);
			// MainApp2.getAllCustomer();

			retrieveCustomer(session);

			// int id = 1;
			// deleteCustomerById(session,id);

			session.getTransaction().commit();

		} catch (Exception e) {
			System.out.println("Exception occured");
		}
	}

	private static void deleteCustomerById(Session session, int id) {
		Query<Customer> query = session
				.createQuery("delete from Customer where customerId=" + id);
		System.out.println("query.executeUpdate()" + query.executeUpdate());
	}

	private static void retrieveCustomer(Session session) {
		Query<Customer> customers = session.createQuery("from Customer");
		List<Customer> list = customers.getResultList();
		System.out.println(list);
	}

	private static void addCustomer(Session session) {
		Customer customer = new Customer("Tommy", "Fred", "12255");

		session.save(customer);
	}

}
