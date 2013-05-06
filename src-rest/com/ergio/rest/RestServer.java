package com.ergio.rest;
 
import org.restlet.Component;
//import org.restlet.Server;
import org.restlet.data.Protocol;
import com.openbravo.data.loader.Session;
import com.openbravo.pos.forms.AppProperties;
 
public class RestServer {
	public static Session session;
	public static AppProperties appProperties;
	
	public static void startRest(Session sessionNew,AppProperties appPropertiesNew) throws Exception{
		session=sessionNew;
		appProperties=appPropertiesNew;
		Component component = new Component();  
	    component.getServers().add(Protocol.HTTP, 8080);  
	  
	    component.getDefaultHost().attach("/test", TestResource.class);  
	    component.getDefaultHost().attach("/inventory", InventoryResource.class);
	    component.start();  
	}
}
