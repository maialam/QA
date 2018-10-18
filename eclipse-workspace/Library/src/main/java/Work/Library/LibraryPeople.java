package Work.Library;

public abstract class LibraryPeople {

	
	public String registerUser;
	public boolean deleteUser;
	public String updateuser;
	
	
	
	public LibraryPeople (String registerUser, boolean deleteUser, String updateUser) {
		
		
		this.registerUser = registerUser;
		this.deleteUser = deleteUser;
		this.updateuser = updateUser;
		
		
	}
	
}
