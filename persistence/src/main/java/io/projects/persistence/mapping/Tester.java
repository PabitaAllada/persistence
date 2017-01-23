package io.projects.persistence.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa-example");

		EntityManager em= emf.createEntityManager();
		
//		User user=new User();
//		user.setName("Pabita Allada");
//				
//		Address address=new Address();
//		address.setCity("Overland Park");
//		address.setState("Kansas");
//				
//		em.getTransaction().begin();
//		em.persist(address);
//		user.setAddress(address);
//		em.persist(user);
//		em.getTransaction().commit();
//		
		User user=em.find(User.class,"206a1408-e782-45ab-91dd-fbda17c22dba");
		System.err.println(user);
        em.close();
        emf.close();
	
	}
}
