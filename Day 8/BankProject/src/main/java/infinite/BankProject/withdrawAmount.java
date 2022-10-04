package infinite.BankProject;

import java.sql.SQLException;
import java.util.Scanner;

import javax.security.auth.login.AccountNotFoundException;

public class withdrawAmount {

	public static void main(String[] args) {
		int accountNo;
		double withdrawAmount;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNo = scanner.nextInt();
		System.out.println("Enter Withdraw Amount ");
		withdrawAmount = scanner.nextDouble();
		BankDAO dao = new BankDAO();
		try {
			System.out.println(dao.withdrawAccount(accountNo, withdrawAmount));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
}

