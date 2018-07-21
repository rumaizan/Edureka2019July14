
public class BufferAndBuilder {

	public static void main(String[] args) {
		
		// Strings are IMMUTABLE
		String str = new String("Hello");
		
		// StringBuffer (Thread-Safe) and StringBuilder (Not Thread-Safe) are MUTABLE
		//StringBuffer buffer = "Hello"; // error
		StringBuffer buffer = new StringBuffer("Hello");
		StringBuilder builder = new StringBuilder("Hello");
		
		str.concat(" World");
		buffer.append(" World");
		builder.append(" World");
		
		System.out.println("str is: "+str);
		System.out.println("buffer is: "+buffer);
		System.out.println("builder is: "+builder);
		

	}

}
