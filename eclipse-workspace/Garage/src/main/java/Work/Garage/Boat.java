package Work.Garage;

public class Boat extends Vehicle {
	
	private boolean sail;
	private int engines;

	
	
	public Boat(String manufacturer, int wheels, String colour, int doors, boolean sail, int engines, boolean modified, boolean damaged) {
		super(wheels, colour, doors);

	this.sail = sail;
	this.engines = engines;
	
	
	super.manufacturer = manufacturer;
	super.wheels = wheels;
	super.colour = colour;
	super.doors = doors;
	super.modified = modified;
	super.damaged = damaged;
	
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Type: Boat \n" + "Manufacturer: " + this.manufacturer + "\nWheels: " + this.wheels + "\nColour: " + this.colour + "\nDoors: " + 
				this.doors + "\nSail: " + this.sail + "\nEngines: " + this.engines + "\nModified: " + this.modified + "\nDamaged: " + this.damaged;
	}
	
	

}
