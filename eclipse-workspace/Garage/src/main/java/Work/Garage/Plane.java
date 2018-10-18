package Work.Garage;

public class Plane extends Vehicle {
	
	
	private int seats;
	private String commercial;

	
	
	public Plane(String manufacturer, int wheels, String colour, int doors, int seats, String commercial, boolean modified, boolean damaged) {
		super(wheels, colour, doors);

	this.commercial = commercial;
	this.seats = seats;
	
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
		return "Type: Plane \n" + "Manufacturer: " + this.manufacturer + "\nWheels: " + this.wheels + "\nColour: " + this.colour + "\nDoors: " + 
				this.doors + "\nSeats: " + this.seats + "\nCommercial: " + this.commercial+ "\nModified: " + this.modified + "\nDamaged: " + this.damaged;	
		}
	
	
}
