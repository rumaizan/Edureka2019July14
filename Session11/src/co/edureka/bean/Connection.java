package co.edureka.bean;

// Jar Files: https://www.dropbox.com/s/gsmrf05u8phsu62/J2EEJars_HSJ.zip?dl=0

// Bean
public class Connection {

	// Attributes
	String driverName;
	String url;
	String user;
	String password;
	Integer poolSize;
	
	public Connection() {
		System.out.println("--Connection Object Constructed--");
	}

	public Connection(String driverName, String url, String user, String password, Integer poolSize) {
		this.driverName = driverName;
		this.url = url;
		this.user = user;
		this.password = password;
		this.poolSize = poolSize;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getPoolSize() {
		return poolSize;
	}

	public void setPoolSize(Integer poolSize) {
		this.poolSize = poolSize;
	}

	// init-method
	public void initConnection(){
		System.out.println("--Connection Initialized--");
	}

	// destroy-method
	public void destroyConnection(){
		System.out.println("--Connection Destroyed--");
	}
	
	@Override
	public String toString() {
		return "Connection [driverName=" + driverName + ", url=" + url + ", user=" + user + ", password=" + password
				+ ", poolSize=" + poolSize + "]\nAddress: "+super.toString();
	}
}
