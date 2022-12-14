package jaxwsservice;

public class CarbinProxy implements jaxwsservice.Carbin {
  private String _endpoint = null;
  private jaxwsservice.Carbin carbin = null;
  
  public CarbinProxy() {
    _initCarbinProxy();
  }
  
  public CarbinProxy(String endpoint) {
    _endpoint = endpoint;
    _initCarbinProxy();
  }
  
  private void _initCarbinProxy() {
    try {
      carbin = (new jaxwsservice.CarbImplServiceLocator()).getCarbImplPort();
      if (carbin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)carbin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)carbin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (carbin != null)
      ((javax.xml.rpc.Stub)carbin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public jaxwsservice.Carbin getCarbin() {
    if (carbin == null)
      _initCarbinProxy();
    return carbin;
  }
  
  public jaxwsservice.Carburant[] getAllCar() throws java.rmi.RemoteException{
    if (carbin == null)
      _initCarbinProxy();
    return carbin.getAllCar();
  }
  
  public void saveC(java.lang.String arg0, java.lang.String arg1) throws java.rmi.RemoteException{
    if (carbin == null)
      _initCarbinProxy();
    carbin.saveC(arg0, arg1);
  }
  
  public void deleteCarburant(jaxwsservice.Carburant arg0) throws java.rmi.RemoteException{
    if (carbin == null)
      _initCarbinProxy();
    carbin.deleteCarburant(arg0);
  }
  
  public jaxwsservice.Carburant updateC(jaxwsservice.Carburant arg0) throws java.rmi.RemoteException{
    if (carbin == null)
      _initCarbinProxy();
    return carbin.updateC(arg0);
  }
  
  public jaxwsservice.Carburant findbyIdc(long arg0) throws java.rmi.RemoteException{
    if (carbin == null)
      _initCarbinProxy();
    return carbin.findbyIdc(arg0);
  }
  
  
}