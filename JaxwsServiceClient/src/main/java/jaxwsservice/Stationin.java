/**
 * Stationin.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package jaxwsservice;

public interface Stationin extends java.rmi.Remote {
    public jaxwsservice.Station update(jaxwsservice.Station arg0) throws java.rmi.RemoteException;
    public jaxwsservice.Station findbyId(long arg0) throws java.rmi.RemoteException;
    public void deleteStation(jaxwsservice.Station arg0) throws java.rmi.RemoteException;
    public jaxwsservice.Station[] getAllS() throws java.rmi.RemoteException;
    public void saveS(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException;
}
