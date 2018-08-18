package co.edureka.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// Persistant Class i.e. Object Structure or Model or Bean or POJO


@Entity
@Table(name="EMPLOYEEEE")
public class Employee {
	
	@Id
	@GeneratedValue
	@Column(name="ID")
	public Integer id;
	
	@Column(name="NAME")
	public String name;
	
	@Column(name="SALARY")
	public Integer salary;
	
	@Column(name="EMAIL")
	public String email;
	
	@Column(name="ADDRESS")
	public String address;
	
	public Employee(){
		
	}
	
	public Employee(Integer id, String name, Integer salary, String email, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.email = email;
		this.address = address;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", email=" + email + ", address="
				+ address + "]";
	}
	
}
