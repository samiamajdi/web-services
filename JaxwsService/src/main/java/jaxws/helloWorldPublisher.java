package jaxws;

import javax.xml.ws.Endpoint;

public class helloWorldPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/ws/hell",new helloWorldImpl() );
		Endpoint.publish("http://localhost:8080/ws/he",new helloWorldImpl() );

	}

}
