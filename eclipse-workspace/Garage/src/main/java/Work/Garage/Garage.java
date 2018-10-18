package Work.Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {


		
		
		private List<Vehicle> newGarage = new ArrayList<Vehicle>();
		

		public void setVehicle (Vehicle a) {
		
			
			newGarage.add(a);
			
			
			
		}
		
		
		public Vehicle getVehicle(String manufacturer) {
			
			if (newGarage.size() > 0) {
				
				
				for (int i = 0; i < newGarage.size(); i++) {
					
					if (newGarage.get(i).manufacturer == manufacturer) {
						
						
						return newGarage.get(i);
						
					}
					
				}
				
			}
			
			
			return null;
			
		}
		
	
	
}
