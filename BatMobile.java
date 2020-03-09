package Ch_homework;

public class BatMobile extends Vehicle{
	
	
	boolean isBatmanHere;
	
public BatMobile(String plateID, float weight, boolean isBatmanHere) {
	
	this.plateID = plateID;
	this.weight = weight;
	this.isBatmanHere = isBatmanHere;
		// TODO Auto-generated constructor stub
	}


	public int getMaximalSpeed() {
		int speed;
		if(isBatmanHere) {
			speed = 500;
		}else {
			speed = 110;
		}
	
	return speed;
	
}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "BatMobile" + plateID + weight ;
	}
}
