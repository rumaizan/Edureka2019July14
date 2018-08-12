package co.edureka.model;

// Persistant Class i.e. Object Structure or Model or Bean or POJO
public class Employee {
	
	public Integer id;
	public String name;
	public Integer salary;
	public String email;
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
