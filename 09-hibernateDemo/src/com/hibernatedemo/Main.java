package com.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(City.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			// Unit of Work tasarım deseninin uygulanmış halidir
			session.beginTransaction();
			// sorgular bunların arasına yazılır

			// ORDER BY Operation
			// "from City c where c.countryCode='TUR' AND c.district='Ankara'"
			// "from City c where c.name LIKE '%kar%'"
			// ASC -> Ascending
			// DESC -> Descending

			// GROUP BY Operation
			List<String> countryCodes = session.createQuery("select c.countryCode from City c GROUP BY c.countryCode")
					.getResultList();
			// executeUpdate ile sabit sorgularla yapılabilir
			for (String countryCode : countryCodes) {
				System.out.println(countryCode);

			}

			// INSERT Operation
			City city = new City();
			city.setName("Düzce 10");
			city.setCountryCode("TUR");
			city.setDistrict("Karadeniz");
			city.setPopulation(100000);

			session.save(city);

			// UPDATE Operation
			City city = session.get(City.class, 4083);
			city.setPopulation(110000);
			System.out.println(city.getPopulation());
			session.save(city);

			// DELETE Operation
			City city = session.get(City.class, 4083);
			session.delete(city);

			// sorgular bunların arasına yazılır
			session.getTransaction().commit();
			System.out.println("Şehir Silindi");
		} finally {
			factory.close();
		}

	}

}
