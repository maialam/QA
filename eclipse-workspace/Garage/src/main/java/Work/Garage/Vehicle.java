package Work.Garage;

public abstract class Vehicle {
	
	
	public int wheels;
	public String colour;
	public int doors; 
	public boolean modified;
	public boolean damaged;
	public String manufacturer;

	


	public Vehicle (String manufacturer, int wheels, String colour, int doors, boolean modified, boolean damaged) {
	
	
		this.wheels = wheels;
		this.colour = colour;
		this.doors = doors;
		this.modified = modified;
		this.damaged = damaged;
		this.manufacturer = manufacturer;
	
		
		
	}
	
	
}
