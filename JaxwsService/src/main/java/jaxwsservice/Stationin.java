package jaxwsservice;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.bind.annotation.XmlElement;

import ma.fstt.persistence.Station;
import ma.fstt.persistence.Stations;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Stationin {
	@WebMethod 
	void saveS(String nom,String ville,String adresse);
	@WebMethod
	void deleteStation(Station id ); 
	@WebMethod
	Station findbyId(Long id);
	@WebMethod
	Station update (Station s);
	@WebMethod
	float retournePrix(String nomS, String date);
	@WebMethod 
	@XmlElement
	 Stations getAllS() ;
}
