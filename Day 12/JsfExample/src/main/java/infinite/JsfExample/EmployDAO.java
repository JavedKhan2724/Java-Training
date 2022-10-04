package infinite.JsfExample;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class EmployDAO implements Serializable{

		public List<Employ> showEmploy(){
			List<Employ> employList = new ArrayList<Employ>();
			employList.add(new Employ(1,"Gaurav","Java","Developer",8425.56));
			employList.add(new Employ(2,"Sohail","Python","Developer",8525.56));
			employList.add(new Employ(3,"Sachin","DotNet","Developer",7425.56));
			employList.add(new Employ(4,"Harshit","Angular","Developer",5625.56));
			employList.add(new Employ(5,"Saurav","React","Developer",8425.56));
			employList.add(new Employ(6,"Arun","J2EE","Developer",9425.56));
			return employList;
			
		}
}
