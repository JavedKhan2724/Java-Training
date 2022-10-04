package infinite.BankProject;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAccountMain {

	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter AccountNo ");
		accountNo = sc.nextInt();
		BankDAO dao = new BankDAO();
		Bank bank;
		try {
			bank = dao.searchAccount(accountNo);
			System.out.println(bank);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
