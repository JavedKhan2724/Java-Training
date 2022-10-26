package infinite.HibOneToOne;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="EmployTable")
public class Employ {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	
	private int empno;
	private String name;
	private String dept;
	private String design;
	private double basic;
	
	@OneToOne(targetEntity = WorkStation.class,cascade = CascadeType.ALL)
	private WorkStation workStation;
	
	
	public WorkStation getWorkStation() {
		return workStation;
	}
	
	public void setWorkStation(WorkStation workStation) {
		this.workStation = workStation;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getDesign() {
		return design;
	}
	public void setDesign(String design) {
		this.design = design;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	
	
}
