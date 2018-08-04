package co.edureka.xml;

import java.io.File;
import java.io.FileInputStream;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

class MyHandler extends DefaultHandler{
	
	public void startDocument() throws SAXException {
		System.out.println("==Document Read Started==");
	}
	
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.print("<"+qName+">");
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
		String data = new String(ch,start,length);
		System.out.print(data);
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("</"+qName+">");
	}
	
	public void endDocument() throws SAXException {
		System.out.println("==Document Read Finshed==");
	}
	
}

public class SAXXMLReader {

	public static void main(String[] args) {
	
		try{
			File file = new File("/Users/ishantkumar/Downloads/students.xml");
			FileInputStream inputStream = new FileInputStream(file);
			
			MyHandler handler = new MyHandler();
			
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
			
			parser.parse(inputStream, handler);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
