package com.ergio.rest;
 
import java.sql.SQLException;
import java.util.List;
//import com.openbravo.pos.forms.AppConfig;
//import com.openbravo.pos.forms.AppProperties;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;
import org.restlet.resource.Post;
import org.restlet.resource.Options;

import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.Datas;
import com.openbravo.data.loader.SerializerReadBasic;
import com.openbravo.data.loader.SerializerReadClass;
import com.openbravo.data.loader.SerializerWriteString;
import com.openbravo.data.loader.StaticSentence;
import com.openbravo.pos.panels.PaymentsModel;



public class InventoryResource extends ServerResource{
	
	@Get
    public String inventoryGet() throws SQLException, BasicException{
		Object[] query = (Object []) new StaticSentence(RestServer.session
	            , "SELECT NAME FROM PRODUCTS"
	            , SerializerWriteString.INSTANCE
	            , new SerializerReadBasic(new Datas[] {Datas.STRING}))
	            .find();

			System.out.println((String)query[0]);
		
			String salida = (String)query[0];
            return salida;
    }
     
    @Delete
    public void deleteSomething(){
        System.out.println("server delete method called.");
    }
}

