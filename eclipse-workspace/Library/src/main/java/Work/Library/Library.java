package Work.Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	
	private List<LibraryItems> newLibrary = new ArrayList <LibraryItems>();
	
	public void setlibraryItems (LibraryItems a) {
		
		
		newLibrary.add(a);
		
		
	}
	
	
	public LibraryItems getlibraryItems(int identity) {
		
		
		if (newLibrary.size() > 0) {
			
			for (int i = 0; i < newLibrary.size(); i++) {
				
				if (newLibrary.get(i).identity == identity) {
					
					return newLibrary.get(i);
					
				}
				
			}
			
		}
		
		return null;
		
		
	}
	
	

}
