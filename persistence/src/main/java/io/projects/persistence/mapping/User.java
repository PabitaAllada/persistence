package io.projects.persistence.mapping;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table

public class User {
	 @Id
		private String id;
		private String name;
		
		@OneToOne
	private Address address;
		
		public User()
		{
			this.id= UUID.randomUUID().toString();
		}
		public String getId() {
			return id;
		}
		public Address getAddress() {
			return address;
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
		
		public void setAddress(Address address) {
			// TODO Auto-generated method stub
			this.address=address;
		}
		
	
	
}
