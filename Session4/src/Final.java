// final class cannot be inherited
final class X{
	// final method cannot be overrided
	final void fun(){
		
	}
}

class Y { //extends X{ // err
	/*void fun(){ // err
		
	}*/
}

public class Final {

	public static void main(String[] args) {
		
		int i = 10;
		i = 100; // Value can be modified any time
		
		final int j = 10;
		//j = 100; // err-> Value cannot be modified. Kind of a Constant
		
	}

}
