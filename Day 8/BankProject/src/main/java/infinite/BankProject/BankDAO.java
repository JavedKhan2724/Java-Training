package infinite.BankProject;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class BankDAO {

	Connection connection;
	PreparedStatement pst;
	
	public String withdrawAccount(int accountNo, double withdrawAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if(bank!=null){
			double balance = bank.getAmount();
			if(balance-withdrawAmount >= 1000){
				String cmd = "update Bank set Amount = Amount-? "+ " where AccountNo=?";
				pst = connection.prepareStatement(cmd);
				pst.setDouble(1, withdrawAmount);
				pst.setInt(2, accountNo);
				pst.execute();
				cmd = "Insert into Trans(AccountNo,TransAmount,TransType)" +"values(?,?,?)";
				pst = connection.prepareStatement(cmd);
				pst.setInt(1, accountNo);
				pst.setDouble(2, withdrawAmount);
				pst.setString(3, "D");
				pst.executeUpdate();
				return "Amount Debited...";
			}else{
				return "Insufficient Funds...";
			}
		}
		return "Account No Not Found...";
	}
	
	public String depositAccount(int accountNo , double depositAmount) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if(bank!=null){
			connection = ConnectionHelper.getConnection();
			String cmd = "update Bank set Amount = Amount+? where "+"accountNo=?";
			pst = connection.prepareStatement(cmd);
			pst.setDouble(1, depositAmount);
			pst.setInt(2, accountNo);
			pst.executeUpdate();
			cmd = "Insert into Trans(AccountNo,TransAmount,TransType)"
					+" values(?,?,?)";
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.setDouble(2, depositAmount);
			pst.setString(3, "C");
			pst.executeUpdate();
			return "Amount Credited";
		}
		return "Account No. Not Found...";
	}
	
	
	public String closeAccount(int accountNo) throws ClassNotFoundException, SQLException {
		Bank bank = searchAccount(accountNo);
		if(bank!=null){
			String cmd = "update bank set status = 'inactive' where accountno=?";
			connection = ConnectionHelper.getConnection();
			pst = connection.prepareStatement(cmd);
			pst.setInt(1, accountNo);
			pst.executeUpdate();
			return "Account Closed..";
		}
		return "Account Not Found...";
	}
	
	public Bank searchAccount(int accountNo) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Bank where AccountNo=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		ResultSet rs = pst.executeQuery();
		Bank bank =  null;
		if(rs.next()){
			bank = new Bank();
			bank.setAccountNo(rs.getInt("accountNo"));
			bank.setFirstName(rs.getString("firstName"));
			bank.setLastName(rs.getString("lastName"));
			bank.setCity(rs.getString("city"));
			bank.setState(rs.getString("state"));
			bank.setAmount(rs.getInt("amount"));
			bank.setCheqFacil(rs.getString("cheqfacil"));
			bank.setAccountType(rs.getString("accountType"));
			
		}
		return bank;
	}
	
	public String createAccount(Bank Bank) throws ClassNotFoundException, SQLException{
		int accountNo = generateAccountNo();
		String cmd = "insert into Bank(AccountNo, FirstName,"+"Lastname,city,state,Amount,CheqFacil,"+"AccountType) values(?,?,?,?,?,?,?,?)";
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, accountNo);
		pst.setString(2, Bank.getFirstName());
		pst.setString(3, Bank.getLastName());
		pst.setString(4, Bank.getCity());
		pst.setString(5, Bank.getState());
		pst.setInt(6, Bank.getAmount());
		pst.setString(7, Bank.getCheqFacil());
		pst.setString(8, Bank.getAccountType());
		pst.executeUpdate();
		return "Account Created";
		
	}
	
	public int generateAccountNo() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select case when max(accountNo) is NULL then 1 else max(accountNo)+1 end accno from Bank";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int accno = rs.getInt("accno");
		return accno;
		
	}
}
