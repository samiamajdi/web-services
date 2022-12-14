package jaxws;

import javax.jws.WebService;

@WebService(endpointInterface = "jaxws.helloWorld")
public class helloWorldImpl implements helloWorld {

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
		
	}

	@Override
	public String sayMyname() {
		return "walkwaaaa";
	}
	

}
