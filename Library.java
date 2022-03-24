package Gradle_demo1;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import com.PassengerId;
import com.Passenger;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
    public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ItemPU");
		EntityManager entitymanager = emf.createEntityManager();
		
		PassengerId pid = new PassengerId();
		pid.setPassengerEmail("abc@gmail.com");
		pid.setPassengerMobile(1234567890);
		
		Passenger pass = new Passenger();
		pass.setPassengerEmail(pid.getPassengerEmail());
		pass.setPassengerMobile(pid.getPassengerMobile());
		pass.setPassengerName("peter");
		pass.setSource("vizag");
		pass.setDestination("delhi");
		
		entitymanager.getTransaction().begin();
		entitymanager.persist(pass);
		entitymanager.flush();
		entitymanager.getTransaction().commit();
		
		
		
	}
}

