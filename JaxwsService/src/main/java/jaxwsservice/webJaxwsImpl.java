package jaxwsservice;



import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.fstt.persistence.Station;

@WebService(endpointInterface = "jaxwsservice.webJaxws")
public class webJaxwsImpl implements webJaxws {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

	@Override
	public String sayMyname() {
		return "walkwaaaa";
	}

	
	



	
	

}
