package ma.fstt.persistence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class test {

	public static void main(String[] args) {
		
		EntityManagerFactory emf =
				Persistence.createEntityManagerFactory("unit");
				EntityManager em = emf.createEntityManager();
				em.getTransaction().begin();
				Station sa = new Station(0L,"Test","test","test",null);
				System.out.println("COMIITING");
                 em.persist(sa);		
			
				em.getTransaction().commit();
	}

}
