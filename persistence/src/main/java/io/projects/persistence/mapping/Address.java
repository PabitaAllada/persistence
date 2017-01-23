package io.projects.persistence.mapping;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Address {
	 @Id
		private String id;
		private String city;
		private String state;
		
		public Address()
		{
			this.id= UUID.randomUUID().toString();
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		@Override
		public String toString() {
			return "Address [id=" + id + ", city=" + city + ", state=" + state + "]";
		}
		
		
}
