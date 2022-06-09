public class Rotor {

	private String[] rotor;
	private String turnoverPoint;

	Rotor(String[] config, String turnoverPoint){
		rotor = config;
		this.turnoverPoint = turnoverPoint;
	}

	public String[] getRotor(){
		return rotor;
	}

	public String getLastIndex(){ return rotor[25]; }

	public String getTurnoverPoint(){
		return turnoverPoint;
	}
}
