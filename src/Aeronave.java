
public class Aeronave {

	private int passageiros;
	private double velMax;
	private double capaCombustivel;
	private double queimaCombPerMinute;

	public Aeronave(int passageiros, double velMax, double capaCombustivel, double queimaCombPerMinute) {

		setPassageiros(passageiros);
		setVelMax(velMax);
		setCapaCombustivel(capaCombustivel);
		setQueimaCombPerMinute(queimaCombPerMinute);
	}

	public int getPassageiros() {
		return passageiros;
	}

	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}

	public double getVelMax() {
		return velMax;
	}

	public void setVelMax(double velMax) {
		if (getVelMax() <= 0) {
			System.out.println("é impossivel q um aviao tenha 0 kms de velocidade maxima ou velocidade negativa");
		} else {
			this.velMax = velMax;
		}
		
		
		
		
	}

	public double getCapaCombustivel() {
		return capaCombustivel;
	}

	public void setCapaCombustivel(double capaCombustivel) {
		this.capaCombustivel = capaCombustivel;
	}

	public double getQueimaCombPerMinute() {
		return queimaCombPerMinute;
	}

	public void setQueimaCombPerMinute(double queimaCombPerMinute) {
		this.queimaCombPerMinute = queimaCombPerMinute;
	}

	public double maisTempoAr() {
		return getCapaCombustivel() / getQueimaCombPerMinute();
	}

}
