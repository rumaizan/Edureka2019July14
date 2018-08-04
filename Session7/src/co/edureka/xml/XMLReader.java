package co.edureka.xml;

import java.io.File;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class XMLReader {

	public static void main(String[] args) {
		
		ArrayList<Employee> employees = new ArrayList<Employee>();
		
		try{
			File file = new File("/Users/ishantkumar/Downloads/employees.xml");
		
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			
			System.out.println("Element is: "+document.getDocumentElement().getNodeName());
			NodeList nodeList = document.getElementsByTagName("employee");
			System.out.println("Size of NodeList: "+nodeList.getLength());
			
			for(int i=0;i<nodeList.getLength();i++){
				
				Node node = nodeList.item(i);
				Element element = (Element)node;
				
				int eid = Integer.parseInt(element.getElementsByTagName("eid").item(0).getTextContent());
				String name = element.getElementsByTagName("name").item(0).getTextContent();
				int salary = Integer.parseInt(element.getElementsByTagName("salary").item(0).getTextContent());
				String email = element.getElementsByTagName("email").item(0).getTextContent();
				String address = element.getElementsByTagName("address").item(0).getTextContent();
				
				System.out.println(eid+"\t"+name+"\t"+salary+"\t"+email+"\t"+address);
				System.out.println("==============================================================");
				
				// Example : Implelemntation of Collections
				Employee emp = new Employee(eid, name, salary, email, address);
				employees.add(emp);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
