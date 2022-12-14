/**
 * Carbin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxwsservice;

public interface Carbin extends java.rmi.Remote {
    public jaxwsservice.Carburant[] getAllCar() throws java.rmi.RemoteException;
    public void saveC(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException;
    public void deleteCarburant(jaxwsservice.Carburant arg0) throws java.rmi.RemoteException;
    public jaxwsservice.Carburant updateC(jaxwsservice.Carburant arg0) throws java.rmi.RemoteException;
    public jaxwsservice.Carburant findbyIdc(long arg0) throws java.rmi.RemoteException;
}
