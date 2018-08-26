package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

//Configure in web.xml file -> org.glassfish.jersey.servlet.ServletContainer;

@Path("/hello")
public class Hello { // Web Service
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){ 			// Web Method
		// some business logic goes here...
		//..
		String response = "This is a plain textual hello";
		return response;
	}
	
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){			// Web Method
		// some business logic goes here...
		//..
		String response = "<html><body><i>This is HTML hello</i></body></html>";
		return response;
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello(){			// Web Method
		// some business logic goes here...
		//..
		String response = "<?xml version='1.0' encoding='UTF-8'?><hello>This is XML hello</hello>";
		return response;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){			// Web Method
		// some business logic goes here...
		//..
		String response = "'response':'This is a JSON Response'"; // JSON is a Key Value Pair
		return response;
	}
	
}
