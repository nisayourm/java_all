	package Ch_homework;
	
	public class MiniVan extends Vehicle{
		
		int nbCustomers;
		
	public MiniVan(String plateID , float weight, int nbCustomers) {
		this.plateID = plateID;
		this.weight = weight;
		this.nbCustomers = nbCustomers;
			// TODO Auto-generated constructor stub
		}

	public int getMaximalSpeed() {
		int maximalSpeed = 130;
		int result = 0;
		if(nbCustomers != 0) {
			result = maximalSpeed - 10 * nbCustomers;
		}
		return result;
	}

	@Override
	public String toString() {
		
		return "MiniVan" + plateID + weight ;
	}
	
	
	}
