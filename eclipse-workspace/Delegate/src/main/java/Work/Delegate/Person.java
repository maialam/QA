package Work.Delegate;

public class Person {
	
	public String name;
	
	public int age;
	
	public String jobTitle;

//	public Object returnData;
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return("This is my people class");
	}
	
	
	
	public Person(String name, int age, String jobTitle) {
		
		
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		
	}
	
	
	
	public void staffIntro() {
		
		
		System.out.println("Hi, my name is " + name + ". I am " + age + " years old and work as a " + jobTitle + ".");
		
	
	}
	
	
	
	
	

}
