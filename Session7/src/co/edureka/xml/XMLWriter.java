package co.edureka.xml;

import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

class Employee{
	
	int eid;
	String name;
	int salary;
	String email;
	String address;
	
	Employee(){
		
	}
	
	Employee(int i, String n, int s, String e, String a){
		eid = i;
		name = n;
		salary = s;
		email = e;
		address = a;
	}
}

public class XMLWriter {

	public static void main(String[] args) {
		
		// Object is created in RAM and data is temporary
		Employee emp = new Employee();
		emp.eid = 101;
		emp.name = "John";
		emp.salary = 50000;
		emp.email = "john@example.com";
		emp.address = "Redwood Shores";
		
		/*ArrayList<Employee> employees = new ArrayList<Employee>();
		for(Employee e : employees){
			//...
		}*/
				
		// We shall write the data in XML File -> Persistance
		
		try {
			
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.newDocument(); // represents the data to be written in XML Document
			
			Element rootElm = document.createElement("employees");
			
			Element empElm = document.createElement("employee");
			Element eidElm = document.createElement("eid");
			Element nameElm = document.createElement("name");
			Element salaryElm = document.createElement("salary");
			Element emailElm = document.createElement("email");
			Element addressElm = document.createElement("address");
			
			Text eidTxt = document.createTextNode(String.valueOf(emp.eid));
			Text nameTxt = document.createTextNode(emp.name);
			Text salaryTxt = document.createTextNode(String.valueOf(emp.salary));
			Text emailTxt = document.createTextNode(emp.email);
			Text addressTxt = document.createTextNode(emp.address);
			
			eidElm.appendChild(eidTxt);
			nameElm.appendChild(nameTxt);
			salaryElm.appendChild(salaryTxt);
			emailElm.appendChild(emailTxt);
			addressElm.appendChild(addressTxt);
			
			empElm.appendChild(eidElm);
			empElm.appendChild(nameElm);
			empElm.appendChild(salaryElm);
			empElm.appendChild(emailElm);
			empElm.appendChild(addressElm);
			
			rootElm.appendChild(empElm);
			
			document.appendChild(rootElm);
			
			// Transform document to XML File
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			
			DOMSource source = new DOMSource(document);
			StreamResult result = new StreamResult(new FileOutputStream(file));
			
			transformer.transform(source, result);
			
			System.out.println("==XML File "+file.getName()+" Written with data ==");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
