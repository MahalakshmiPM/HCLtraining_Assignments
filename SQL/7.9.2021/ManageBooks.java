package CurdApplication;


public class ManageBooks {
	private int bookId;
	private String bookname;
	private int borrowerId;
	private String returned;
	
	public ManageBooks() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ManageBooks [bookId=" + bookId + ", bookname=" + bookname + ", borrowerId=" + borrowerId
				+ ", returned=" + returned + "]";
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public int getBorrowerId() {
		return borrowerId;
	}

	public void setBorrowerId(int borrowerId) {
		this.borrowerId = borrowerId;
	}


	public String getReturned() {
		return returned;
	}

	public void setReturned(String returned) {
		this.returned = returned;
	}	

}
