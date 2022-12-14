package jaxwsservice;

import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ma.fstt.persistence.Carburant;
import ma.fstt.persistence.Carburants;
import ma.fstt.persistence.Station;
import ma.fstt.persistence.Stations;

@WebService(endpointInterface = "jaxwsservice.Carbin")
public class CarbImpl implements Carbin {
	private static final String PERSISTENCE_UNIT_NAME = "unit";	
	private static EntityManager entityMgrObj = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME).createEntityManager();
	private static EntityTransaction transactionObj = entityMgrObj.getTransaction();
	@Override
	public void saveC(String nom, String description) {
		if(!transactionObj.isActive()) {
			transactionObj.begin();
		}
		Carburant internaute = new Carburant(0L, nom , description);
		entityMgrObj.persist(internaute);
		transactionObj.commit();
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public Carburants getAllCar() {

		Query queryObj = entityMgrObj.createQuery("SELECT e FROM Carburant e");
		
		 
		Carburants lList = new Carburants();
		lList.setCar( queryObj.getResultList());
		if (lList != null && lList.size() > 0) {			
			return  lList;
			
		} else {
			System.out.println(" khawya");
			return null;
	}
	}

	@Override
	public void deleteCarburant(Carburant id) {
		transactionObj.begin();
		entityMgrObj.remove(entityMgrObj.merge(id));
		entityMgrObj.flush();
		transactionObj.commit();
		
		
	}

	@Override
	public Carburant findbyIdc(Long id) {
		Carburant u= entityMgrObj.find(Carburant.class,id);
		return u;
	}

	@Override
	public Carburant updateC(Carburant s) {
		transactionObj.begin();entityMgrObj.merge(s);
		transactionObj.commit();
		
		return s;
	}
}
