package Work.Garage;

public class Car extends Vehicle {

	private int mileage;
	private int pedals;

	
	
	public Car(String manufacturer, int wheels, String colour, int doors, int mileage, int pedals, boolean modified, boolean damaged) {
		super(manufacturer, wheels, colour, doors, modified, damaged);

	this.mileage = mileage;
	this.pedals = pedals;
	
	
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
		return "Type: Car \n" + "Manufacturer: " + this.manufacturer + "\nWheels: " + this.wheels + "\nColour: " + this.colour + "\nDoors: " + 
		this.doors + "\nMilage: " + this.mileage + "\nPedals: " + this.pedals + "\nModified: " + this.modified + "\nDamaged: " + this.damaged;
	}
	

	
	
}


