package Work.Library;

public class Books extends LibraryItems{
	
	private int bookID;
	private String bookName;
	private String author;
	private String bookPages;
	
	
	
	public Books(int bookID, String bookName, String author, String bookPages, boolean checkOut, boolean checkIn, String addItem, boolean removeItem, String updateItem) {
		super(checkOut, checkIn, addItem, removeItem, updateItem);
		
		this.bookID = bookID;
		this.bookName = bookName;
		this.author = author;
		this.bookPages = bookPages;
		
		super.checkOut = checkOut;
		super.checkIn = checkIn;
		super.addItem = addItem;
		super.removeItem = removeItem;
		super.updateItem = updateItem;
		
	}

}
