public class Rotor {

	private String[][] rotor;
	private String turnoverPoint;

	Rotor(String[][] rotor, String turnoverPoint){
		this.rotor = rotor;
		this.turnoverPoint = turnoverPoint;
	}

	public String[][] getRotorArray(){
		return rotor;
	}


	public String getTurnoverPoint(){
		return turnoverPoint;
	}
}
