package io.projects.persistence;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table
@NamedQueries(
	  @NamedQuery(name="Employee.findByEmail", query="SELECT e FROM Employee e WHERE e.email=:pEmail ")
)
public class Employee {
	
    @Id
	private String id;
	private String name;
	private String city;
	private int salary;
	
	@Column(columnDefinition="VARCHAR(128)" , unique=true)
	private String email;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getId() {
		return id;
	}
	
	public Employee()
	{
		this.id= UUID.randomUUID().toString();
	}
	
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", email=" + email
				+ "]";
	}
	
}
