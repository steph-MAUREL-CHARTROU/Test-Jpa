import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entities.Livre;

/**
 * 
 * @author StephanieMC
 *
 */
public class TestJpa {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("tp-librairie");
		EntityManager em = entityManagerFactory.createEntityManager();
		
		Livre l = em.find(Livre.class,1);
		if(l!=null) {
			
			System.out.println(l);
		}

	}

}
