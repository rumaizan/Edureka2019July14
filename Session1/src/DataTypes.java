
public class DataTypes {

	public static void main(String[] args) {
		
		// Data Storage : Single Value Containers
		
		// b is the name of storage container, which has a size of 8bits and contain value 10(data)
		byte b = 100; // 8 (-128 to 0 to 127)
		short s = 200; // 16
		int i = 1000; // 32
		long l = 10000000; // 64
		
		// 5.5f is data which is also known as literal
		// literals are stored in a constant pool, within the RAM
		// 5.5f is stored in 32 bits where 5.5 is stored in 64bits
		// we cannot say float f = 5.5, because we are copying 64bit of data into 32bits 
		
		float distance = 5.5f; // 32
		double dist = 6.6; // 64
		
		// write operation : writing the data in the storage container
		char ch = '$';
		char ch1 = '\u0958'; // Unicode for Indian Rupee
		char ch2 = 65; // Unicode
		
		// read operation : reading the data from the stroage container
		System.out.println("ch is: "+ch);
		System.out.println("ch1 is: "+ch1);
		System.out.println("ch2 is: "+ch2);
		
		boolean gpsEnabled = true;
		gpsEnabled = false;
		
		// Data in Storage Containers can be anytime modified
		ch1 = '\u20b9'; // Value updated to a new data
		
		// we say ch1 is a variable, its value can be modified anytime
	}

}
