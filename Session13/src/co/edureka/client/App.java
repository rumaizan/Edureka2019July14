package co.edureka.client;

import co.edureka.model.Cab;
import co.edureka.model.CabFactory;
import co.edureka.model.Connection;
import co.edureka.model.DBHelper;

public class App {

	public static void main(String[] args) {
		
		//Connection con1 = new Connection();
		//Connection con2 = new Connection();
		
		/*Connection con1 = Connection.getConnection();
		Connection con2 = Connection.getConnection();
		
		System.out.println("con1 is: "+con1);
		System.out.println("con2 is: "+con2);*/
		
		Cab cab = CabFactory.getCab(3);
		cab.setRouteAndPrice();
		cab.bookCab();
		
		// DAO
		DBHelper helper = new DBHelper();
		helper.insert();
		

	}

}
