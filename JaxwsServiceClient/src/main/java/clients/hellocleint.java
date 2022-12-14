package clients;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import jaxwsservice.StationImplService;
import jaxwsservice.StationImplServiceLocator;
import jaxwsservice.Stationin;
import jaxwsservice.CarbImplService;
import jaxwsservice.CarbImplServiceLocator;
import jaxwsservice.Carbin;
import jaxwsservice.Station;

public class hellocleint {

	public static void main(String[] args) throws ServiceException, RemoteException {
		StationImplService hello= new StationImplServiceLocator();
		Stationin hellop = hello.getStationImplPort();
		//hellop.saveS("borak", "tfo", "zot");
		Station[] y= hellop.getAllS(); 
		 
		for ( int i=0; i<y.length; i++ ) {
		    Station s=y[ i ] ;
		    System.out.println(s.getNom());
		}
		Station j = hellop.findbyId(2);
		System.out.println("yhyhyhyhyh"+j.getNom());
	//	System.out.println("id"+j.getId_stat());
		
		Station k = new Station ();
		k.setId_stat(j.getId_stat());
		k.setNom("non");
		k.setAdresse("non");
		k.setVille("non");
		hellop.update(k);
		//hellop.deleteStation(y[3]);
		CarbImplService carb= new CarbImplServiceLocator();
		Carbin carbb = carb.getCarbImplPort();
		carbb.saveC("haja", "sifti l3a9a");
		
	}

}
