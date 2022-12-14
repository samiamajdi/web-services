package jaxwsservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style = Style.RPC)
public interface webJaxws {
	@WebMethod 
	String getHelloWorldAsString(String name);
	@WebMethod 
	String sayMyname();
	
}
