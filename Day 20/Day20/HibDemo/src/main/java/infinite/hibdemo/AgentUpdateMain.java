package infinite.hibdemo;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class AgentUpdateMain {

	public static void main(String[] args) {
		Agent agent=new Agent();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Agent Id");
		agent.setAgentid(sc.nextInt());
		System.out.println("Enter Agent Name");
		agent.setName(sc.next());
		System.out.println("Enter City");
		agent.setCity(sc.next());
		System.out.println("Enter Gender");
		String g=sc.next();
		if(g.toUpperCase().equals("MALE")){
			agent.setGender(Gender.MALE);
		}
		if(g.toUpperCase().equals("FEMALE")){
			agent.setGender(Gender.FEMALE);
		}
		System.out.println("Enter Marital Status(0/1) ");
		agent.setMaritalstatus(sc.nextInt());;
		System.out.println("Enter Premium");
		agent.setPrimium(sc.nextDouble());
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory sf=cfg.buildSessionFactory();
		Session session=sf.openSession();
		Query query=session.createQuery("from Agent where agentid="+agent.getAgentid());
		List<Agent> agentList=query.list();
		if(agentList.size()==1){
			session=sf.openSession();
			Transaction trans=session.beginTransaction();
			session.saveOrUpdate(agent);
			trans.commit();
			System.out.println("Record updated.....");
		}else{
			System.out.println("Record not found");
		}

	}

}
