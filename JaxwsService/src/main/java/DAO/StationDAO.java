package DAO;

import java.util.*;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.xml.bind.annotation.XmlElement;

import ma.fstt.persistence.Station;
import ma.fstt.persistence.Stations;

public class StationDAO {
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();

	
	public void saveStation(String nom, String ville, String adresse) {
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Station internaute = new Station(0L, nom , ville,adresse);
		entityMgrObj.persist(internaute);
		transactionObj.commit();
		
	}
	
	public  Stations getAllStation() {
		
		Query queryObj = entityMgrObj.createQuery("SELECT e FROM Station e");
		@SuppressWarnings("unchecked")
		 
		Stations lList = new Stations();
		lList.getEmployees().add((Station) queryObj.getResultList());
		if (lList != null && lList.size() > 0) {			
			return lList;
		} else {
			return null;
		}
	}
}
