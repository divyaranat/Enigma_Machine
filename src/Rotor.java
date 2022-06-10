public class Rotor {

	private String[] rotor;
	private String turnoverPoint;
	private int rotorShiftCount;

	Rotor(String[] config, String turnoverPoint){
		rotor = config;
		this.turnoverPoint = turnoverPoint;
		rotorShiftCount = 0;
	}

	public String[] getRotor(){
		return rotor;
	}

	public String getLastIndex(){ return rotor[25]; }

	public String getTurnoverPoint(){
		return turnoverPoint;
	}

	public int getRotorShiftCount() {
		return rotorShiftCount;
	}

	public void incrementRotorShiftCount(){
		rotorShiftCount++;
		rotorShiftCount = rotorShiftCount % 26;
	}
}
