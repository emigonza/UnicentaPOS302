package com.ergio.rest;
 
import java.sql.SQLException;
//import com.openbravo.pos.forms.AppConfig;
//import com.openbravo.pos.forms.AppProperties;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.restlet.resource.Post;
import org.restlet.resource.Options;



public class TestResource extends ServerResource{
	
	@Get
    public String greet() throws SQLException{
			String salida = RestServer.session.getURL();	
			salida = salida + " | " + RestServer.appProperties.getHost()
			       + " | " + RestServer.appProperties.getProperty("db.user");
            return salida;
    }
     
    @Delete
    public void deleteSomething(){
        System.out.println("server delete method called.");
    }
}

