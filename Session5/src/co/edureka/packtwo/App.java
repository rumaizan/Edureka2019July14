package co.edureka.packtwo;

import co.edureka.packone.One;
//import co.edureka.packthree.One; // Error -> Ambiguos Import
//import co.edureka.packone.Two; // error we cannot access default outside the package

//import java.util.*; // Import All Classes -> not a good practice !! Instead import only what you need !!

// static import
import static java.lang.Math.PI;
import static co.edureka.packone.One.REQUEST_CODE;

// Inheritance Across Package
class CA extends One{
	
	void show(){
		protShow();  // inherited and behaves as private
		//pvtShow(); // err: not inherited
		//defShow(); // err: not inherited
	}
	
}

public class App {

	public static void main(String[] args) {
		
		//One oRef = new One();
		//oRef.pvtShow();  // we cannot access private outside the class and hence outside package not allowed
		//oRef.defShow();  // we cannot access default outside the package
		//oRef.protShow(); // we cannot access protected outside the package
		//oRef.pubShow();  // Accessible outside the package
		
		CA cRef = new CA();
		cRef.pubShow();    // Inheritable Outside the package
		// private and default are not inheritable outside the package 
		// protected is inheritable outside the package but once inherited, behaves as private
		// cRef.protShow(); // direct access is error, since it behaves as private
		cRef.show();
		
		System.out.println("PI is: "+PI);
		System.out.println("Request Code is: "+REQUEST_CODE);
		
		// Use the Same Name Class with Package Name
		co.edureka.packthree.One oRef = new co.edureka.packthree.One();
	}

}
