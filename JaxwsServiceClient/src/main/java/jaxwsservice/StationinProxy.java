package jaxwsservice;

public class StationinProxy implements jaxwsservice.Stationin {
  private String _endpoint = null;
  private jaxwsservice.Stationin stationin = null;
  
  public StationinProxy() {
    _initStationinProxy();
  }
  
  public StationinProxy(String endpoint) {
    _endpoint = endpoint;
    _initStationinProxy();
  }
  
  private void _initStationinProxy() {
    try {
      stationin = (new jaxwsservice.StationImplServiceLocator()).getStationImplPort();
      if (stationin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)stationin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)stationin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (stationin != null)
      ((javax.xml.rpc.Stub)stationin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public jaxwsservice.Stationin getStationin() {
    if (stationin == null)
      _initStationinProxy();
    return stationin;
  }
  
  public jaxwsservice.Station update(jaxwsservice.Station arg0) throws java.rmi.RemoteException{
    if (stationin == null)
      _initStationinProxy();
    return stationin.update(arg0);
  }
  
  public jaxwsservice.Station findbyId(long arg0) throws java.rmi.RemoteException{
    if (stationin == null)
      _initStationinProxy();
    return stationin.findbyId(arg0);
  }
  
  public void deleteStation(jaxwsservice.Station arg0) throws java.rmi.RemoteException{
    if (stationin == null)
      _initStationinProxy();
    stationin.deleteStation(arg0);
  }
  
  public jaxwsservice.Station[] getAllS() throws java.rmi.RemoteException{
    if (stationin == null)
      _initStationinProxy();
    return stationin.getAllS();
  }
  
  public void saveS(java.lang.String arg0, java.lang.String arg1, java.lang.String arg2) throws java.rmi.RemoteException{
    if (stationin == null)
      _initStationinProxy();
    stationin.saveS(arg0, arg1, arg2);
  }
  
  
}