package infinite.BankProject;

import java.sql.SQLException;
import java.util.Scanner;

public class closeAccountMain {
	public static void main(String[] args) {
		int accountNo;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account No...");
		accountNo = sc.nextInt();
		BankDAO  dao = new BankDAO();
		try {
			System.out.println(dao.closeAccount(accountNo));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
