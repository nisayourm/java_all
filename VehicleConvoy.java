	package Ch_homework;	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;
	
	public class VehicleConvoy {
		List<Vehicle> listvehicle = new ArrayList<>();
		
		 public void addVehicle(Vehicle vehicle){
			
			 listvehicle.add(vehicle);
	
			
		}
		@SuppressWarnings({ "unchecked", "rawtypes" })
		int getMaximalSpeed(){
			List speeds = new ArrayList<>();
			for(Vehicle speed : listvehicle ) {
				speeds.add(speed.getMaximalSpeed());
			;
			}
			int lowest = 0;
			for(int i = 0; i < speeds.size(); i++) {
				lowest = (int) Collections.min(speeds);
			}
			return lowest;
			 
		 }
		

		}
		
