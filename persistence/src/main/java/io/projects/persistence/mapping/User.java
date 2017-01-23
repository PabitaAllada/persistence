package io.projects.persistence.mapping;

import java.util.List;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table

public class User {
	 @Id
		private String id;
		private String name;
		
//		//home address
//		@OneToOne
//	private Address address;
		
		//office address
//		@ManyToOne
//		private Address address;
		
		 @OneToMany
		 private List<Address> addresses;

//		
//	@ManyToMany
//		private List<Address> addresses;

		
	public List<Address> getAddresses() {
			
	return addresses;
		}

		
	public void setAddresses(List<Address> addresses) 
	{
			
	this.addresses = addresses;

		}

		public User()
		{
			this.id= UUID.randomUUID().toString();
		}
		public String getId() {
			return id;
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
		
		
		
		
	
	
}
