package infinite.HibOneToOne;


import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;


public class MainProg {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		Employ employ1 = new Employ();
		employ1.setName("Javed");
		employ1.setDept("Java");
		employ1.setDesign("Manager");
		employ1.setBasic(99999.99);
		
		WorkStation workStation1 = new WorkStation();
		workStation1.setFloorNo("First Floor");
		workStation1.setCubicalId("C3");
		workStation1.setDomain("Conduent");
		workStation1.setRackFacility("Yes");
		workStation1.setEmploy(employ1);
		employ1.setWorkStation(workStation1);
		session.save(employ1);
		transaction.commit();
		System.out.println("Tables are Created...");
		
		
		
	}
}
