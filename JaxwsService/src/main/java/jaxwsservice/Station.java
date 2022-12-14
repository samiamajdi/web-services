package jaxwsservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface Station {
	@WebMethod 
	void saveS(String nom,String ville,String adresse);
	@WebMethod 
	 List getAllS() ;
}
