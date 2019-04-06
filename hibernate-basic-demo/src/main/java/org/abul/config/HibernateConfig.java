package org.abul.config;

import java.util.Properties;

import org.abul.entity.Customer;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class HibernateConfig {

	private static SessionFactory sf;

	public static SessionFactory getSessionFactory() {
		try {
			if (null == sf) {
				Configuration configuration = new Configuration();

				Properties properties = new Properties();

				// db info
				properties.put(Environment.DRIVER, "org.h2.Driver");
				properties.put(Environment.URL, "jdbc:h2:file:./Conjurving;DB_CLOSE_ON_EXIT=FALSE;AUTO_SERVER=TRUE");
				properties.put(Environment.USER, "admin");
				properties.put(Environment.PASS, "admin");

				// hibernate toppings
				properties.put(Environment.SHOW_SQL, "true");
				properties.put(Environment.DIALECT,
						"org.hibernate.dialect.MySQL5Dialect");
				properties.put(Environment.HBM2DDL_AUTO, "update");
				properties.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
				configuration.setProperties(properties);

				configuration.addAnnotatedClass(Customer.class);

				ServiceRegistry serviceRegistry = (ServiceRegistry) new StandardServiceRegistryBuilder()
						.applySettings(configuration.getProperties()).build();

				sf = configuration.buildSessionFactory(serviceRegistry);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sf;

	}

}
