package p8;

public class Rectangulo extends Figura{
	private double b;
	private double h;
	
	public Rectangulo(double h, double b) {
		this.b=b;
		this.h=h;
	}
	@Override
	public double CA() {
		return b*h;
	}
}
