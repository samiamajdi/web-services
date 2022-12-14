package jaxwsservice;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlElement;

import ma.fstt.persistence.Carburant;
import ma.fstt.persistence.Carburants;
import ma.fstt.persistence.Station;
import ma.fstt.persistence.Stations;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Carbin {
	@WebMethod 
	void saveC(String nom,String description);
	@WebMethod
	void deleteCarburant(Carburant id ); 
	@WebMethod
	Carburant findbyIdc(Long id);
	@WebMethod
	Carburant updateC(Carburant s);
	@WebMethod 
	 @XmlElement
	 Carburants getAllCar() ;
}
