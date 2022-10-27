package infinite.HibLMS;

import java.util.List;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;




public class EmployDAO {



   SessionFactory sFactory;
    Session session;
    
    public List<Employ> showEmploy() {
        sFactory= SessionHelper.getSession();
          Session session=sFactory.openSession();  
        Query query = session.getNamedQuery("showEmploy");
        List<Employ> employList = query.list();
        return employList;
    }
}