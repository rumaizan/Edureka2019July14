package co.edureka.client;

interface State{
	void showState();
}

class NewOrder implements State{
	public void showState(){
		System.out.println("Product is just Ordered");
	}
}

class Shipped implements State{
	public void showState(){
		System.out.println("Product is Shipped");
	}
}

class Delivered implements State{
	public void showState(){
		System.out.println("Product is Delivered");
	}
}

class Product {
	
	State state; // Has-A Relation
	
	void setState(State s){
		state = s;
	}
	
	State getState(){
		return state;
	}
}

public class StatePattern {

	public static void main(String[] args) {
		
		Product product = new Product();
		
		NewOrder order = new NewOrder();
		product.setState(order);
		
		product.getState().showState();
		
		
		// Later...
		Shipped shipped = new Shipped();
		product.setState(shipped);
		
		product.getState().showState();
		
		//..
		
		Delivered delivered = new Delivered();
		product.setState(delivered);
		
		product.getState().showState();

	}

}
