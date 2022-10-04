package com.infinite.employproject;
import java.net.DatagramSocket;
import java.util.List;

public class EmployBal {

	static StringBuilder sb = new StringBuilder();
	
	static EmployDAO dao = new EmployDAO();
	
	public String updateEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	
	public String deleteEmployBal(int empno) {
		return dao.deleteEmployDao(empno);
	}
	public Employ searchEmployBal(int empno){
		return dao.searchEmployDao(empno);
	}
	public List<Employ> showEmployBal(){
		return dao.showEmployDao();
	}
	
	public String addemployBal(Employ employ) throws EmployException {
		if(isValid(employ)==false){
			throw new EmployException(sb.toString());
		}
		return dao.addEmployDao(employ);
	}
	
	public String updateEmployBal(Employ employ) throws EmployException {
		if(isValid(employ)==false){
			throw new EmployException(sb.toString());
		}
		return dao.updateEmployDao(employ);
	}
	
	public boolean isValid(Employ employ) {
		boolean valid=true;
		if(employ.getEmpno()<0){
			valid = false;
			sb.append("Employ no cant be negative or zero\r\n");
		}
		if(employ.getName().length()<6){
			valid = false;
			sb.append("Employ Name contains min. 5 char..\r\n");
		}
		if(employ.getDept().length()<4){
			valid = false;
			sb.append("Employ Dept contains min 4 char...\r\n");
		}
		if(employ.getDesign().length()<5){
			valid =false;
			sb.append("Employ Design contains min 4 char...\r\n");
		}
		if(employ.getBasic()<5000||employ.getBasic()>80000){
			valid = false;
			sb.append("Employ Basic must be between 5000 to 80000\r\n");
		}
		return valid;
	}
}
