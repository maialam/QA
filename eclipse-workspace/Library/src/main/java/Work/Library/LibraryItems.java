package Work.Library;

public abstract class LibraryItems {
	
	public boolean checkOut;
	public boolean checkIn;
	public String addItem;
	public boolean removeItem;
	public String updateItem;
	public int identity;
	

	
	public LibraryItems (int identity, boolean checkOut, boolean checkIn, String addItem, boolean removeItem, String updateItem) {
		
		
		this.identity = identity;
		this.checkOut = checkOut;
		this.checkIn = checkIn;
		this.addItem = addItem;
		this.removeItem = removeItem;
		this.updateItem = updateItem;
		
	}
	
}
