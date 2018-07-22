class Cab{
	
	Cab(){
		System.out.println("==Cab Object Created==");
	}
	
	void bookCab(){
		System.out.println("Cab Booked !! Arriving Soon !!");
	}
}


class UberGo extends Cab{
	
	UberGo(){
		System.out.println("==UberGo Object Created==");
	}
	
	void bookCab(){
		System.out.println("UberGo Booked !! Arriving Soon !!");
	}
}


class UberX extends Cab{
	UberX(){
		System.out.println("==UberX Object Created==");
	}
	
	void bookCab(){
		System.out.println("UberX Booked !! Arriving Soon !!");
	}
}


class UberMoto extends Cab{
	UberMoto(){
		System.out.println("==UberMoto Object Created==");
	}
	
	void bookCab(){
		System.out.println("UberMoto Booked !! Arriving Soon !!");
	}
}


public class RTP {

	public static void main(String[] args) {
		
		/*UberGo go = new UberGo();
		go.bookCab();*/
		
		// Reference Variable of Parent can point to the object of Child.
		// Vice Versa isnt possible
		// Object is created for UberGo
		/*Cab cab = new UberGo(); // Polymorphic Statement
		cab.bookCab();*/
		
		// RUN TIME POLYMORPHISM
		
		Cab cab;
		
		cab = new UberGo();
		cab.bookCab();
		
		System.out.println("=============");
		
		cab = new UberX();
		cab.bookCab();
		
		System.out.println("=============");
		
		cab = new UberMoto();
		cab.bookCab();

	}

}
