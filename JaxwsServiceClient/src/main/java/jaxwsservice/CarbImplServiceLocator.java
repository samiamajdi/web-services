/**
 * CarbImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxwsservice;

public class CarbImplServiceLocator extends org.apache.axis.client.Service implements jaxwsservice.CarbImplService {

    public CarbImplServiceLocator() {
    }


    public CarbImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CarbImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CarbImplPort
    private java.lang.String CarbImplPort_address = "http://localhost:8080/ws/carb";

    public java.lang.String getCarbImplPortAddress() {
        return CarbImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CarbImplPortWSDDServiceName = "CarbImplPort";

    public java.lang.String getCarbImplPortWSDDServiceName() {
        return CarbImplPortWSDDServiceName;
    }

    public void setCarbImplPortWSDDServiceName(java.lang.String name) {
        CarbImplPortWSDDServiceName = name;
    }

    public jaxwsservice.Carbin getCarbImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CarbImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCarbImplPort(endpoint);
    }

    public jaxwsservice.Carbin getCarbImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            jaxwsservice.CarbImplPortBindingStub _stub = new jaxwsservice.CarbImplPortBindingStub(portAddress, this);
            _stub.setPortName(getCarbImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCarbImplPortEndpointAddress(java.lang.String address) {
        CarbImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (jaxwsservice.Carbin.class.isAssignableFrom(serviceEndpointInterface)) {
                jaxwsservice.CarbImplPortBindingStub _stub = new jaxwsservice.CarbImplPortBindingStub(new java.net.URL(CarbImplPort_address), this);
                _stub.setPortName(getCarbImplPortWSDDServiceName());
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
        if ("CarbImplPort".equals(inputPortName)) {
            return getCarbImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://jaxwsservice/", "CarbImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://jaxwsservice/", "CarbImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CarbImplPort".equals(portName)) {
            setCarbImplPortEndpointAddress(address);
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
