package jaxwsservice;

import javax.xml.ws.Endpoint;

public class webJaxwsPublisher {

	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:8080/ws/carb",new CarbImpl() );
		Endpoint.publish("http://localhost:8080/ws/station",new StationImpl() );

	}

}
