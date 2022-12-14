package jaxwsservice;

import java.net.MalformedURLException;
import java.net.URL;

import jaxws.helloWorld;
import ma.fstt.persistence.Carburants;
import ma.fstt.persistence.Station;
import ma.fstt.persistence.Stations;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;


public class clientside {

	public static void main(String[] args) throws MalformedURLException {
	URL url = new URL("http://localhost:8080/ws/carb?wsdl");
		
        //1st argument service URI, refer to wsdl document above
	//2nd argument is service name, refer to wsdl document above
	
	
        QName qname = new QName("http://jaxwsservice/", "CarbImplService");

        Service service = Service.create(url, qname);

        Carbin hello = (Carbin) service.getPort(Carbin.class);

       // System.out.println( hello.retournePrix("station", "2022/12/13 23:49:40"));
       Carburants yy= hello.getAllCar(); 
     //  System.out.println( y.getNom());
    
	}

}
