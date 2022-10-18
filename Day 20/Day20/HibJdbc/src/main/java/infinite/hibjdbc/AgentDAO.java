package infinite.hibjdbc;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class AgentDAO {
   SessionFactory sfact;
   Session session;
   
   public String addAgent(Agent agent) {
		sfact=SessionHelper.getConnection();
		session=sfact.openSession();
		Transaction trans=session.beginTransaction();
		session.save(agent);
		trans.commit();
		return "Record Add...";
  	 
	}
   public List<Agent> showAgent(){
	   sfact=SessionHelper.getConnection();
	   session=sfact.openSession();
	   Query query=session.createQuery("from Agent");
	   List<Agent> agentList=query.list();
	   return agentList;
   }
}
