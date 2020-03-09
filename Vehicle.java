	package Ch_homework;
	
	public abstract class Vehicle {
		String plateID;
		float weight;
		public  String toString() {
			return" [plate Id = "+ plateID +"," + " weight= "+ weight +"] " + "speed is ";
		}
		public abstract int getMaximalSpeed();
		
		
	}
	