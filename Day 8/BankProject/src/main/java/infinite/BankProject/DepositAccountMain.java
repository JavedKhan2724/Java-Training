package infinite.BankProject;

import java.sql.SQLException;
import java.util.Scanner;
 
public class DepositAccountMain {

	public static void main(String[] args) {
		int accountNo;
		double depositAmount;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter AccountNo  ");
		accountNo=scanner.nextInt();
		System.out.println("Enter Deposit Amount  ");
		depositAmount = scanner.nextDouble();
		BankDAO dao = new BankDAO();
		try {
			System.out.println(dao.depositAccount(accountNo, depositAmount));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
