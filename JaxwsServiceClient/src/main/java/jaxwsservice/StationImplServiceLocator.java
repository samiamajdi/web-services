/**
 * StationImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxwsservice;

public class StationImplServiceLocator extends org.apache.axis.client.Service implements jaxwsservice.StationImplService {

    public StationImplServiceLocator() {
    }


    public StationImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StationImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StationImplPort
    private java.lang.String StationImplPort_address = "http://localhost:8080/ws/station";

    public java.lang.String getStationImplPortAddress() {
        return StationImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StationImplPortWSDDServiceName = "StationImplPort";

    public java.lang.String getStationImplPortWSDDServiceName() {
        return StationImplPortWSDDServiceName;
    }

    public void setStationImplPortWSDDServiceName(java.lang.String name) {
        StationImplPortWSDDServiceName = name;
    }

    public jaxwsservice.Stationin getStationImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StationImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStationImplPort(endpoint);
    }

    public jaxwsservice.Stationin getStationImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            jaxwsservice.StationImplPortBindingStub _stub = new jaxwsservice.StationImplPortBindingStub(portAddress, this);
            _stub.setPortName(getStationImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStationImplPortEndpointAddress(java.lang.String address) {
        StationImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (jaxwsservice.Stationin.class.isAssignableFrom(serviceEndpointInterface)) {
                jaxwsservice.StationImplPortBindingStub _stub = new jaxwsservice.StationImplPortBindingStub(new java.net.URL(StationImplPort_address), this);
                _stub.setPortName(getStationImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("StationImplPort".equals(inputPortName)) {
            return getStationImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaxwsservice/", "StationImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaxwsservice/", "StationImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StationImplPort".equals(portName)) {
            setStationImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
