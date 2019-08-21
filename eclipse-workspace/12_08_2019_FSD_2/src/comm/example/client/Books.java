package comm.example.client;

public class Books extends Product {
	
	private String book_name;
	private String author;
	public Books() {

	}
	public Books(String book_name, String author) {
		super();
		this.book_name = book_name;
		this.author = author;
	}
	public String getDetails() 
	{
		return "Bookname:"+book_name+"Author:"+author;
	}

}
