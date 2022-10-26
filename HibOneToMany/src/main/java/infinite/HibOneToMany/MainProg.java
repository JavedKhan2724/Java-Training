package infinite.HibOneToMany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

public class MainProg {

	public static void main(String[] args) {
		AnnotationConfiguration cfg = new AnnotationConfiguration().configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		
		Question question1 = new Question();
		question1.setQname("What is Java?");
		
		Answer ans1 = new Answer();
		ans1.setAnswerName("Java is a programming language.");
		ans1.setPostedBy("Prasanna Pappu");
		
		
		Answer ans2 = new Answer();
		ans2.setAnswerName("Java is used for making applications.");
		ans2.setPostedBy("Javed Khan");
		
		List<Answer> lstAnswer1 = new ArrayList<Answer>();
		lstAnswer1.add(ans1);
		lstAnswer1.add(ans2);
		
		question1.setAnswers(lstAnswer1);
		session.save(question1);
		transaction.commit();
		System.out.println("Table Created");
		
	}
}
