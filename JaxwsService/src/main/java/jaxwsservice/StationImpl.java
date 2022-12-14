package jaxwsservice;

import java.util.Collection;
import java.util.List;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.xml.bind.annotation.XmlElement;


import DAO.StationDAO;
import ma.fstt.persistence.HistoCarb;
import ma.fstt.persistence.Station;
import ma.fstt.persistence.Stations;


@WebService(endpointInterface = "jaxwsservice.Stationin")
public class StationImpl implements Stationin{
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

	@Override
	public void saveS(String nom, String ville, String adresse) {
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Station internaute = new Station(0L, nom , ville,adresse);
		entityMgrObj.persist(internaute);
		transactionObj.commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public  Stations getAllS() {
		
		Query queryObj = entityMgrObj.createQuery("SELECT e FROM Station e");
		@SuppressWarnings("unchecked")
		 
		Stations lList = new Stations();
		lList.setEmployees( queryObj.getResultList());
		if (lList != null && lList.size() > 0) {	
			System.out.println("tfoooooo");
			return lList;
		} else {
			System.out.println("kwa");
			return null;
		}
	/*//private StationDAO stationDao= new StationDAO();

	public void saveS(String nom, String ville, String adresse) {
	 //this.stationDao.saveStation(nom, ville, adresse);
		
	}

	@SuppressWarnings("unchecked")
	
	public Stations getAllS() {
		return this.stationDao.getAllStation();
	}*/
	}

	@Override
	public void deleteStation(Station i) {
		//Query q=entityMgrObj.createQuery("SELECT p FROM Station p WHERE p.id_stat=?1",Station.class);
		//q.setParameter(1,id);
		//Station h =(Station) q.getResultList().stream().findFirst().orElse(null);; 
		transactionObj.begin();
		
		entityMgrObj.remove(entityMgrObj.merge(i));
		transactionObj.commit();
	}

	@Override
	public Station findbyId(Long id) {
		Station u= entityMgrObj.find(Station.class,id);
		return u;
	}

	@Override
	public Station update(Station s) {
		transactionObj.begin();
		entityMgrObj.merge(s);
		transactionObj.commit();
		
		return s;
	}

	@Override
	public float retournePrix(String nomS,String date) {
		Query q=entityMgrObj.createQuery("SELECT p FROM Station p WHERE p.nom=?1",Station.class).setParameter(1, nomS);
		Station v =(Station) q.getResultList().stream().findFirst().orElse(null);
	System.out.println(v.getNom());
	Query qqq=entityMgrObj.createQuery("SELECT p FROM HistoCarb p WHERE p.date=?1 and p.station.id_stat=?2",HistoCarb.class).setParameter(1, date).setParameter(2, v.getId_stat());
		HistoCarb dd=(HistoCarb) qqq.getResultList().stream().findFirst().orElse(null);
		
		return dd.getPrix();
	}
	
}
