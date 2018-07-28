package co.edureka.packone;

public class App {

	public static void main(String[] args) {
		
		One oRef = new One();
		//oRef.pvtShow();
		oRef.defShow();
		oRef.protShow();
		oRef.pubShow();
		
		System.out.println("============================");
		
		Two tRef = new Two();
		//tRef.pvtShow();
		tRef.defShow();
		tRef.protShow();
		tRef.pubShow();

	}

}
