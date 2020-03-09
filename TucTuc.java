package Ch_homework;

public class TucTuc extends Vehicle{

	int nbCustomers;
	
	public TucTuc(String plateID, float weight, int nbCustomers) {
		// TODO Auto-generated constructor stub
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomers;
	}

	
	public int getMaximalSpeed() {
		int maximalSpeed = 130;
		int result = 0;
		if(nbCustomers != 0) {
			result = maximalSpeed - 5 * nbCustomers;
		}
		return result;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "TucTuc " + plateID + weight;
	}
}
