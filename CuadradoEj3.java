package p8;

public class Cuadrado extends Figura {
	private double l;
	
	public Cuadrado(double l){
		this.l=l;
	}
	@Override
	public double CA() {
		return l*l;
	}
}
