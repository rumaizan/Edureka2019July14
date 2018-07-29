package co.edureka.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;

class Student{
	
	int roll;
	String name;
	String phone;
	String address;
	
	String getCSVData(){
		String str = roll+","+name+","+phone+","+address;
		return str;
	}
	
	void showStudent(){
		System.out.println(roll+" belongs to "+name+". Can be contacted at "+phone+" and lives in "+address);
	}
}

public class FileDemo {

	void writeDataInFile(String data){
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","students.txt");
			
			// API: FileOutputStream -> Writes the data in the file in the form of bytes
			//FileOutputStream outputStream = new FileOutputStream(file);
			/*FileOutputStream outputStream = new FileOutputStream(file,true); // true is append mode
			outputStream.write(data.getBytes());
			outputStream.close();*/
			
			// API: FileWriter -> Writes the data in the file in the form of text
			//FileWriter writer = new FileWriter(file);
			FileWriter writer = new FileWriter(file,true); // true -> append mode 
			writer.write(data);
			writer.close();
			
			
			System.out.println("--Student Data Saved--");
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}
	
	void readDataFromFile(){
		
		try {
			
			File file = new File("/Users/ishantkumar/Downloads","students.txt");
			
			// API: FileInputStream -> Reads the data from the file in the form of bytes
			/*FileInputStream inputStream = new FileInputStream(file);
			//char ch = (char)inputStream.read();
			//System.out.println(ch);
			
			int i = 0;
			while((i = inputStream.read()) != -1){
				char ch = (char)i;
				System.out.print(ch);
			}
			
			inputStream.close();*/
			
			// API: FileReader -> Reads the data from the file in the form of text
			FileReader reader = new FileReader(file);
			BufferedReader buffer = new BufferedReader(reader); // reads line by line
			
			String line = "";
			while((line = buffer.readLine()) !=null ){
				System.out.println(line);
				
				Student student = new Student();
				String[] arr = line.split(",");
				
				student.roll = Integer.parseInt(arr[0]);
				student.name = arr[1];
				student.phone = arr[2];
				student.address = arr[3];
				
				student.showStudent();
				System.out.println("*************");
				
			}
			
			buffer.close();
			reader.close();
			
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
		
	}
	
	void generateNewClass(String className){
		try {
			
			File file = new File("/Users/ishantkumar/Downloads",className+".java");
			FileWriter writer = new FileWriter(file);
			String instructions = "public class "+className+"{\n"
					+ "\tpublic static void main(String[] args){\n"
					+ "\n\t}\n}";
			
			writer.write(instructions);
			writer.close();
			System.out.println("--"+className+" created--");
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}
	
	public static void main(String[] args) {
		
		// Student Object is holding data
		// data is temporarily available as object s created in RAM
		// we must persist the data for later use... eg: saving in a file.. (Persistance)
		
		/*Student sRef = new Student();
		sRef.roll = 601;
		sRef.name = "George";
		sRef.phone = "+91 66666 55555";
		sRef.address = "Western Shores";
		
		String dataToWrite = sRef.getCSVData();*/
		
		FileDemo fd = new FileDemo();
		//fd.writeDataInFile(dataToWrite+"\n");
		
		//fd.readDataFromFile();
		
		fd.generateNewClass("Employee");

	}

}
