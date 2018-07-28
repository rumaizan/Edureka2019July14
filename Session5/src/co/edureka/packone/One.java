package co.edureka.packone;

// private default protected and public !!

// public
public class One {

	public static int REQUEST_CODE = 101;
	
	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

// default
class Two{
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

// We can have nested classes as private, protected, public or default..
class Six{
	class Seven{
		
	}
	
	private class Eight{
		
	}
	
	public class Nine{
		
	}
	
	protected class Ten{
		
	}
}

// Source File Name should be same as that of public class's Name !!
// In one source file we can have only one public class
/*public class Three{
	
}*/


// We cannot have a private or protected class
/*private class Four{
	
}

protected class Five{
	
}*/