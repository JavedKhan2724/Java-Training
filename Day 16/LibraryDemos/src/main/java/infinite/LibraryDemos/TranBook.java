package infinite.LibraryDemos;

import java.sql.Date;

public class TranBook {

		public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
		private String userName;
		private int bookId;
		private Date fromDate;
		public TranBook(String userName, int bookId, Date fromDate) {
			super();
			this.userName = userName;
			this.bookId = bookId;
			this.fromDate = fromDate;
		}
		public TranBook() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
}
