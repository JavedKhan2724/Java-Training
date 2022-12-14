package infinite.JspJdbc;


import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.exceptions.RSAException;

public class EmployDAO {

	
	Connection connection;
	PreparedStatement pst;
	
	
	public int validate(String user,String pwd) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from Login where userName=? and PassCode=?";
		pst=connection.prepareStatement(cmd);
		pst.setString(1, user);
		pst.setString(2, pwd);
		ResultSet rs= pst.executeQuery();
		rs.next();
		int count = rs.getInt("cnt");
		return count;
		
	}
	public String addEmploy(Employ employ) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into Employ(name,dept,desig,basic)"+"values(?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, employ.getName());
		pst.setString(2, employ.getDept());
		pst.setString(3, employ.getDesign());
		pst.setInt(4, employ.getBasic());
		pst.executeUpdate();
		return "Record Inserted....";
	}
	
	public String updateEmploy(Employ employNew) throws ClassNotFoundException, SQLException {
		Employ employ = searchEmploy(employNew.getEmpno());
		if(employ!=null){
			String cmd = "update employ set name=?,Dept=?,desig=?,"
					+ "Basic=? where empno=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setString(1, employNew.getName());
			pst.setString(2, employNew.getDept());
			pst.setString(3, employNew.getDesign());
			pst.setInt(4, employNew.getBasic());
			pst.setInt(5, employNew.getEmpno());
			pst.executeUpdate();
			return "Employ Record Updated...";
		}
		return "Record Not Found...";
	}
	
	public String deleteEmploy(int empno) throws ClassNotFoundException, SQLException{
		Employ employ = searchEmploy(empno);
		if(employ!=null){
			connection = ConnectionHelper.getConnection();
			String cmd = "delete from Employ where empno=?";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, empno);
			pst.executeUpdate();
			return "Record deletd...";
		}
		return "Employ Record Not Found";
	}
	
	
	public Employ searchEmploy(int empno) throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ where empno=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, empno);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		if(rs.next()){
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesign(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
		}
		return employ;
	}
	
	
	public List<Employ> showEmploy() throws ClassNotFoundException, SQLException {
		List<Employ> employList = new ArrayList<Employ>();
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Employ";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		Employ employ = null;
		while(rs.next()){
			employ = new Employ();
			employ.setEmpno(rs.getInt("empno"));
			employ.setName(rs.getString("name"));
			employ.setDept(rs.getString("dept"));
			employ.setDesign(rs.getString("desig"));
			employ.setBasic(rs.getInt("basic"));
			employList.add(employ);
		}
		return employList;
	}
}
