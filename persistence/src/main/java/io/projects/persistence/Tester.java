package io.projects.persistence;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;


public class Tester {

	public static void main(String[] args) {
	
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("jpa-example");

		EntityManager em= emf.createEntityManager();
		
		
		Employee employee=new Employee();
		employee.setCity("Boston");
		employee.setEmail("Jim@gmail.com");
		employee.setName("Jim Passmore");
        employee.setSalary(90000);		
        
        
        //INSERT INTO TABLE 
        //em.getTransaction().begin();
        //em.persist(employee);
        //em.getTransaction().commit();
        
        //FIND ONE
        //Employee existing = em.find(Employee.class, "b2afa90b-afc1-47f2-ad51-a64e16d873d3");
        //System.out.println(existing);
        
        //UPDATE
        // Employee existing = em.find(Employee.class, "b2afa90b-afc1-47f2-ad51-a64e16d873d3");
        //existing.setCity("Missouri");
        //existing.setEmail("bobwarring@gmail.com");
       
//        em.getTransaction().begin();
//        em.merge(existing);
//        em.getTransaction().commit();
        
//        //DELETE
//        Employee existing = em.find(Employee.class, "282f8e83-75ba-4dcb-b009-ca3a63fbb081");
//        
//        em.getTransaction().begin();
//        em.remove(existing);
//        em.getTransaction().commit();
        
        //FINDALL
//       TypedQuery<Employee> query = em.createQuery("SELECT e FROM Employee e ORDER BY e.email ASC", Employee.class);
//       List<Employee> employeeList=query.getResultList();
//       employeeList.stream().forEach(emp -> System.err.print(emp));
        
        //FIND BY PARAMETER
        TypedQuery<Employee> query = em.createNamedQuery("Employee.findByEmail", Employee.class);
        query.setParameter("pEmail", "Jim@gmail.com");
        List<Employee> employeeList=query.getResultList();
        employeeList.stream().forEach(emp -> System.err.print(emp));
        
        em.close();
		emf.close();
		
		
	}

}
